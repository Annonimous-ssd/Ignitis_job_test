package com.example.ignitis_job_test;

import com.example.ignitis_job_test.API.UserController;
import com.example.ignitis_job_test.DTO.UserDto;
import com.example.ignitis_job_test.Services.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

@SpringBootTest
public class messageTest {

    @Mock
    private UserService userService;

    private UserController userController;


    @Test
    public void testRegisterUser_ValidUserDto_ReturnsResponseEntityWithHttpStatusOK() {


    }
}
