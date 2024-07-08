package com.spring.core.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.liquibase.DataSourceClosingSpringLiquibase;
import org.springframework.stereotype.Component;

@Component("EmailService")
public class EmailService {

    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void sendMail(){
        String[] listMail = this.dataSource.getMail();
        for (String mail : listMail) {
            System.out.println(mail);
        }
    }
}
