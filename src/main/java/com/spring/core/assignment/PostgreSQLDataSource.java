package com.spring.core.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PostgreSQLDataSource")
@Primary
public class PostgreSQLDataSource implements DataSource{

    @Override
    public String[] getMail(){
        String[] result = {"1@gmail.com", "2@gmail.com", "3@gmail.com"};
        
        return result;
    }
}
