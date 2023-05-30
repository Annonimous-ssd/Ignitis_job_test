package com.example.ignitis_job_test.DAO;

import com.example.ignitis_job_test.DTO.StatisticDto;
import com.example.ignitis_job_test.JooqGenerated.Tables;
import com.example.ignitis_job_test.JooqGenerated.tables.Messages;
import com.example.ignitis_job_test.JooqGenerated.tables.records.MessagesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class StatisticDao {

    private final DSLContext dslContext;
    private final StatisticDto statisticDto;

    public StatisticDao(DSLContext dslContext, StatisticDto statisticDto) {
        this.dslContext = dslContext;
        this.statisticDto = statisticDto;
    }


    public Object getStatistic(String userName) {
        var ref = new Object() {
            LocalDateTime firstMessageTime = null;
            LocalDateTime lastMessageTime = null;
            int totalLength = 0;
            String lastMessage = null;
        };

        Result<MessagesRecord> fetch = this.dslContext.selectFrom(Tables.MESSAGES)
                .where(Messages.MESSAGES.CREATOR.eq(userName)).fetch();

        if (fetch.isNotEmpty()) {
            statisticDto.setUser(fetch.getValue(0, Tables.MESSAGES.CREATOR));
            statisticDto.setMessageCount(fetch.size());

            fetch.forEach(data -> {
                LocalDateTime messageTime = data.get(Messages.MESSAGES.SENT_TIME);
                if (ref.firstMessageTime == null || messageTime.isBefore(ref.firstMessageTime)) {
                    ref.firstMessageTime = messageTime;
                }
                if (ref.lastMessageTime == null || messageTime.isAfter(ref.lastMessageTime)) {
                    ref.lastMessageTime = messageTime;
                    ref.lastMessage = data.get(Messages.MESSAGES.MESSAGE);

                }

                ref.totalLength += data.get(Messages.MESSAGES.MESSAGE).length();
            });
            statisticDto.setAverageMessageLength((double) ref.totalLength / fetch.size());
            statisticDto.setFirstMessageTime(ref.firstMessageTime);
            statisticDto.setLastMessageTime(ref.lastMessageTime);
            statisticDto.setLastMessage(ref.lastMessage);

            return statisticDto;
        } else {
            return "No statistics available";
        }
    }
}

