package com.example.ignitis_job_test.DAO;

import com.example.ignitis_job_test.DTO.UserDto;
import com.example.ignitis_job_test.Exceptions.EmptyException;
import com.example.ignitis_job_test.JooqGenerated.Tables;
import com.example.ignitis_job_test.JooqGenerated.tables.Admins;
import com.example.ignitis_job_test.JooqGenerated.tables.Users;
import javassist.NotFoundException;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class UserDao {
    private final DSLContext dslContext;

    @Autowired
    public UserDao(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public Object addUser(UserDto userDto) {
        int adminRow = this.dslContext.selectFrom(Tables.ADMINS).where(Admins.ADMINS.ADMIN_NAME.eq(userDto.getCreatedBy())).execute();
        if (adminRow == 0) {
            return "Admin has to exist";
        } else if (userDto.getCreatedBy() == null) {
            throw new EmptyException("");
        } else if (userDto.getUserName() != null) {
            this.dslContext.insertInto(Tables.USERS)
                    .set(Users.USERS.USER_NAME, userDto.getUserName())
                    .set(Users.USERS.CREATED_BY, userDto.getCreatedBy())
                    .set(Users.USERS.REGISTRATION_TIME, LocalDateTime.now())
                    .execute();
            return "User added";
        } else {
            return "All fields must be filled";
        }
    }

    public void deleteUser(String userName) throws NotFoundException {
        int deletedRow = this.dslContext
                .deleteFrom(Tables.USERS)
                .where(Users.USERS.USER_NAME.eq(userName))
                .execute();
        if (deletedRow == 0) {
            throw new NotFoundException("User " + userName + " not found");
        }
    }
}

