package com.nguyen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
	public static void main(String[] args) {
		//http:localhost:8081
		ApplicationContext applicationContext =  SpringApplication.run(DemoApplication.class, args);																																																																																																																																											
		// HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		// System.out.println(helloWorld.hello());

		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String bean : beanNames) {
			System.out.println(bean);
		}
	}

}
