package com.spring.core.assignment;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages =  "spring.core.assignment")
public class AppConfig {
    
    @Bean
    public MySQLDataSource mySQLDataSource(){
        return new MySQLDataSource();
    }

    @Bean
    public PostgreSQLDataSource postgreSQLDataSource(){
        return new PostgreSQLDataSource(); 
    }

    @Bean
    public EmailService emailService(){
        return new EmailService(postgreSQLDataSource());
    }
}
