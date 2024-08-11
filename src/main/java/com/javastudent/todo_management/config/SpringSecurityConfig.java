package com.javastudent.todo_management.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configurable
public class SpringSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize) -> {
            authorize.anyRequest().authenticated();
        }).httpBasic(Customizer.withDefaults());


        return http.build();
    }
}
