/*
 * This file is generated by jOOQ.
 */
package com.example.ignitis_job_test.JooqGenerated;


import com.example.ignitis_job_test.JooqGenerated.tables.Admins;
import com.example.ignitis_job_test.JooqGenerated.tables.Messages;
import com.example.ignitis_job_test.JooqGenerated.tables.Users;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ignitis extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>IGNITIS</code>
     */
    public static final Ignitis IGNITIS = new Ignitis();

    /**
     * The table <code>IGNITIS.ADMINS</code>.
     */
    public final Admins ADMINS = Admins.ADMINS;

    /**
     * The table <code>IGNITIS.MESSAGES</code>.
     */
    public final Messages MESSAGES = Messages.MESSAGES;

    /**
     * The table <code>IGNITIS.USERS</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Ignitis() {
        super("IGNITIS", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Admins.ADMINS,
            Messages.MESSAGES,
            Users.USERS
        );
    }
}
