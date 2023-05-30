package ChangeLogs

databaseChangeLog {

    changeSet(id: 'createSchema', author: 'MantasU') {
        sql('CREATE SCHEMA IGNITIS')
    }

    changeSet(author: 'MantasU', id: 'create_user_table') {
        createTable(tableName: 'USERS', schemaName: 'IGNITIS') {
            column(name: "id", type: "BIGINT", autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'USER_NAME', type: 'VARCHAR(255)') {
                constraints(nullable: false, unique: true, uniqueConstraintName: "uk_users_user_name")
            }
            column(name: 'CREATED_BY', type: 'VARCHAR(255)')
            column(name: 'REGISTRATION_TIME', type: 'TIMESTAMP')
        }
    }

    changeSet(author: 'MantasU', id: 'create_admin_table') {
        createTable(tableName: 'ADMINS', schemaName: 'IGNITIS') {
            column(name: "id", type: "BIGINT", autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'ADMIN_NAME', type: 'VARCHAR(255)') {
                constraints(nullable: false, unique: true, uniqueConstraintName: "uk_users_admin_name")
            }
            column(name: 'CREATED_BY', type: 'VARCHAR(255)')
            column(name: 'REGISTRATION_TIME', type: 'TIMESTAMP')
        }
    }

    changeSet(author: 'MantasU', id: 'create_message_table') {
        createTable(tableName: 'MESSAGES', schemaName: 'IGNITIS') {
            column(name: "id", type: "BIGINT", autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'CREATOR', type: 'VARCHAR(255)')
            column(name: 'MESSAGE', type: 'CLOB')
            column(name: 'SENT_TO', type: 'VARCHAR(255)')
            column(name: 'SENT_TIME', type: 'TIMESTAMP')
        }
    }
}

