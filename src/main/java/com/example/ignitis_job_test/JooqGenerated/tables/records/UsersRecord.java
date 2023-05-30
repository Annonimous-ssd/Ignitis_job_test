/*
 * This file is generated by jOOQ.
 */
package com.example.ignitis_job_test.JooqGenerated.tables.records;


import com.example.ignitis_job_test.JooqGenerated.tables.Users;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record4<Long, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>IGNITIS.USERS.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>IGNITIS.USERS.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>IGNITIS.USERS.USER_NAME</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>IGNITIS.USERS.USER_NAME</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>IGNITIS.USERS.CREATED_BY</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>IGNITIS.USERS.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>IGNITIS.USERS.REGISTRATION_TIME</code>.
     */
    public void setRegistrationTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>IGNITIS.USERS.REGISTRATION_TIME</code>.
     */
    public LocalDateTime getRegistrationTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Users.USERS.REGISTRATION_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserName();
    }

    @Override
    public String component3() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component4() {
        return getRegistrationTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserName();
    }

    @Override
    public String value3() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value4() {
        return getRegistrationTime();
    }

    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public UsersRecord value4(LocalDateTime value) {
        setRegistrationTime(value);
        return this;
    }

    @Override
    public UsersRecord values(Long value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, String userName, String createdBy, LocalDateTime registrationTime) {
        super(Users.USERS);

        setId(id);
        setUserName(userName);
        setCreatedBy(createdBy);
        setRegistrationTime(registrationTime);
        resetChangedOnNotNull();
    }
}
