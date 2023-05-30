package com.example.ignitis_job_test.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Setter
@Component
public class StatisticDto {
    private String user;
    private Integer messageCount;
    private LocalDateTime firstMessageTime;
    private LocalDateTime lastMessageTime;
    private double averageMessageLength;
    private String lastMessage;

}

