package com.spring.core;
/**
        @Qualifier > @Primary   
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

public class Client {
    public static void main(String[] args) {

        // Vehicle vehicle = new Bike();

        // Traveler traveler = new Traveler(vehicle);
        // traveler.startJourney();


        //use IOC Container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = applicationContext.getBean(Car.class);
        car.move();
        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();
        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();
    }
}
