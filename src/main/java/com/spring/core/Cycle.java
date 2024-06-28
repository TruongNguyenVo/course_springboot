package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cycle")
@Primary
public class Cycle implements Vehicle {

    @Override
    public void move(){
        System.out.println("Cycle is moving.....");
    }
}
