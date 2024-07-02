package com.spring.core;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.spring.core")
public class AppConfig {



    @Bean
    public Vehicle  car(){
        return new Car();
    }
    // @Bean
    // public Vehicle  bike(){
    //     return new Bike();
    // }
    // @Bean
    // public Vehicle  cycle(){
    //     return new Cycle();
    // }

    // @Bean
    // //contructor
    // public Traveler traveler(){
    //     return new Traveler(car());
    // }
}
