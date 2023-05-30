package com.example.ignitis_job_test.LiquibaseConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.driverClassName}")
    String driverClassName;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(this.url)
                .driverClassName(this.driverClassName)
                .username(this.username)
                .password(this.password)
                .build();
    }
}

