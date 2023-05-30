package com.example.ignitis_job_test.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MessageDto {
    String creator;
    String message;
    String sentTo;

}
