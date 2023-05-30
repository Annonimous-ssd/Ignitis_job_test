package com.example.ignitis_job_test.API;

import com.example.ignitis_job_test.DTO.MessageDto;
import com.example.ignitis_job_test.Services.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/user"})
public class UserController {
    private final MessageService messageService;

    public UserController(final MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping({"/getMessages"})
    public ResponseEntity<MessageDto> getMessages(@RequestParam String creatorName, @RequestParam Long id) {
        MessageDto message = this.messageService.getMessage(creatorName, id);
        return message != null ? ResponseEntity.ok(message) : ResponseEntity.notFound().build();
    }

    @PostMapping({"/postMessage"})
    public ResponseEntity<String> postMessage(@RequestBody MessageDto messageDto) {
        try {
            this.messageService.sendMessage(messageDto);
            return new ResponseEntity<>("Completed", HttpStatus.OK);
        } catch (Exception var3) {
            return new ResponseEntity<>("Internal server error, contact developer my friend", HttpStatus.GATEWAY_TIMEOUT);
        }
    }


}

