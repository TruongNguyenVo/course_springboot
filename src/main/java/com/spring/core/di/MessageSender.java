package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {
    
    @Autowired
    @Qualifier("sms")
    private MessageService messageService;
    
    @Autowired
    private MessageService eMessageService;

    // @Autowired
    // public MessageSender(MessageService messageService){
    //     this.messageService = messageService;
    //     System.out.println("contructor 1");
    // }

    // // @Autowired
    // public MessageSender(@Qualifier("sms") MessageService messageService, MessageService eMessageService){
    //     this.messageService = messageService;
    //     this.eMessageService = eMessageService;
    //     System.out.println("contructor 2");
    // }


    // @Autowired
    // public void setMessageSender(@Qualifier("sms") MessageService messageService){
    //     this.messageService = messageService;
    // }


    public void sendMessage(String message){
        this.messageService.sendMessage(message);
    }
}
