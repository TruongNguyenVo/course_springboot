package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    
    public static void main(String[] args) {
        String message = "子子認知和、私はNguyenです。- Hi, I'am Nguyen";
        // EmailService emailService = new EmailService();
        // SMSService smsService = new SMSService();
        // MessageSender messageSender = new MessageSender(emailService);
        // messageSender.sendMessage(message);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SMSService smsService = applicationContext.getBean(SMSService.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);



    }
}
