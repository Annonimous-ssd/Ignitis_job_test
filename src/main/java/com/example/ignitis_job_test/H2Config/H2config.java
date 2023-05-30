package com.example.ignitis_job_test.H2Config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class H2config {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseaServer()throws SQLException {
        return Server.createTcpServer(
                "-tcp","-tcpAllowOthers","-tcpPort","9090");
    }
}
