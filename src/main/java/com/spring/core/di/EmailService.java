package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println(message + " cre: Email service");
    }

}
