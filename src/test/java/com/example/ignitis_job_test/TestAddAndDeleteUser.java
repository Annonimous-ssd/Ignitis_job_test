package com.example.ignitis_job_test;

import com.example.ignitis_job_test.DAO.UserDao;
import com.example.ignitis_job_test.DTO.UserDto;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class TestAddAndDeleteUser {

    @Autowired
    private UserDao userDao;

    @Test
    void passAddUser() {
        UserDto userDto = new UserDto();
        userDto.setUserName("Rimas");
        userDto.setCreatedBy("Lukas");
        assertEquals("Admin has to exist", userDao.addUser(userDto));

    }

    @Test
    void failAddUser() {
        UserDto userDto = new UserDto();
        userDto.setUserName("Rimas");
        assertEquals("Admin has to exist", userDao.addUser(userDto));
    }


    @Test
    void passDeleteUser() {
        String userName = "Rimas";
        assertEquals("javassist.NotFoundException: User Rimas not found", userDao.deleteUser(userName));
    }

    @Test
    void failDeleteUser() {
        String userName = "Gipsas";
        assertNotEquals(new NotFoundException("User " + userName + " not found"), userDao.deleteUser(userName));
    }


}
