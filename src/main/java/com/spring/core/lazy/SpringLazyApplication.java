package com.spring.core.lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.core.scope.SpringAnnonationApplication;

@SpringBootApplication
public class SpringLazyApplication {
    public static void main(String[] args) {    
         ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringLazyApplication.class, args);
        LazyLoader lazyLoader = configurableApplicationContext.getBean(LazyLoader.class);


    }
}
