package com.javastudent.webservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Spring Boot REST API Documentation",
		description = "Sring Boot REST API Documentation",
		version = "v1.0",
		contact = @Contact(
			name = "Vo Truong Nguyen",
			email = "vonguyen.0407@gmail.com",
			url = "https://github.com/TruongNguyenVo"
		),
		license = @License(
			name = "Nguyen 1.0",
			url = "https://github.com/TruongNguyenVo"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "Spring Boot User Management Documentation",
		url = "https://github.com/TruongNguyenVo"
	)
)
public class WebserviceApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
