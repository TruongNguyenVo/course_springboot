package com.spring.core.di;

public class Client {
    
    public static void main(String[] args) {
        String message = "子子認知和、私はNguyenです。- Hi, I'am Nguyen";
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(message);

    }
}
