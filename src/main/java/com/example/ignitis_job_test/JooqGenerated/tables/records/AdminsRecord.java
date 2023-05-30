/*
 * This file is generated by jOOQ.
 */
package com.example.ignitis_job_test.JooqGenerated.tables.records;


import com.example.ignitis_job_test.JooqGenerated.tables.Admins;

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
public class AdminsRecord extends UpdatableRecordImpl<AdminsRecord> implements Record4<Long, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>IGNITIS.ADMINS.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>IGNITIS.ADMINS.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>IGNITIS.ADMINS.ADMIN_NAME</code>.
     */
    public void setAdminName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>IGNITIS.ADMINS.ADMIN_NAME</code>.
     */
    public String getAdminName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>IGNITIS.ADMINS.CREATED_BY</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>IGNITIS.ADMINS.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>IGNITIS.ADMINS.REGISTRATION_TIME</code>.
     */
    public void setRegistrationTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>IGNITIS.ADMINS.REGISTRATION_TIME</code>.
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
        return Admins.ADMINS.ID;
    }

    @Override
    public Field<String> field2() {
        return Admins.ADMINS.ADMIN_NAME;
    }

    @Override
    public Field<String> field3() {
        return Admins.ADMINS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Admins.ADMINS.REGISTRATION_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAdminName();
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
        return getAdminName();
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
    public AdminsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminsRecord value2(String value) {
        setAdminName(value);
        return this;
    }

    @Override
    public AdminsRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public AdminsRecord value4(LocalDateTime value) {
        setRegistrationTime(value);
        return this;
    }

    @Override
    public AdminsRecord values(Long value1, String value2, String value3, LocalDateTime value4) {
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
     * Create a detached AdminsRecord
     */
    public AdminsRecord() {
        super(Admins.ADMINS);
    }

    /**
     * Create a detached, initialised AdminsRecord
     */
    public AdminsRecord(Long id, String adminName, String createdBy, LocalDateTime registrationTime) {
        super(Admins.ADMINS);

        setId(id);
        setAdminName(adminName);
        setCreatedBy(createdBy);
        setRegistrationTime(registrationTime);
        resetChangedOnNotNull();
    }
}