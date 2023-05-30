package com.example.ignitis_job_test.Services;

import com.example.ignitis_job_test.DAO.UserDao;
import com.example.ignitis_job_test.DTO.UserDto;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    public Object addUser(UserDto userDto) {
       return this.userDao.addUser(userDto);
    }

    public void deleteUser(String userName) throws NotFoundException {
        this.userDao.deleteUser(userName);
    }

    public UserService(final UserDao userDao) {
        this.userDao = userDao;
    }
}

