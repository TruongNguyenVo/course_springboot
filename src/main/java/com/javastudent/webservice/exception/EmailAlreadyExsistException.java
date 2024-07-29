package com.javastudent.webservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExsistException extends RuntimeException{
    private String message;
    public EmailAlreadyExsistException(String message){
        super(message);
    }
}
