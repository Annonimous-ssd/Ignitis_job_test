package com.example.ignitis_job_test.DAO;

import com.example.ignitis_job_test.DTO.MessageDto;
import com.example.ignitis_job_test.JooqGenerated.Tables;
import com.example.ignitis_job_test.JooqGenerated.tables.Messages;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class MessageDao {
    private final DSLContext dslContext;

    @Autowired
    public MessageDao(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public void sendMessage(MessageDto messageDto) {
        this.dslContext.insertInto(Tables.MESSAGES)
                .set(Messages.MESSAGES.CREATOR, messageDto.getCreator())
                .set(Messages.MESSAGES.MESSAGE, messageDto.getMessage())
                .set(Messages.MESSAGES.SENT_TO, messageDto.getSentTo())
                .set(Messages.MESSAGES.SENT_TIME, LocalDateTime.now())
                .execute();
    }

    public MessageDto getMessage(String creatorName, Long id) {
        return this.dslContext.selectFrom(Tables.MESSAGES)
                .where(Messages.MESSAGES.ID.eq(id).and(Messages.MESSAGES.CREATOR
                        .eq(creatorName))).fetchOneInto(MessageDto.class);
    }
}
