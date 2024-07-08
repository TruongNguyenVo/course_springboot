package com.spring.core.assignment;

import org.springframework.stereotype.Component;

@Component("MySQLDataSource")
public class MySQLDataSource implements DataSource {

    @Override
    public String[] getMail(){
        String[] result = {"4@gmail.com", "5@gmail.com", "6@gmail.com"};
        
        return result;
    }
}
