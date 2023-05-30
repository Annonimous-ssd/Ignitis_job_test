package com.example.ignitis_job_test.Services;

import com.example.ignitis_job_test.DAO.MessageDao;
import com.example.ignitis_job_test.DTO.MessageDto;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageDao messageDao;

    public void sendMessage(MessageDto messageDto) {
        this.messageDao.sendMessage(messageDto);
    }

    public MessageDto getMessage(String creatorName, Long id) {
        return this.messageDao.getMessage(creatorName, id);
    }

    public MessageService(final MessageDao messageDao) {
        this.messageDao = messageDao;
    }
}

