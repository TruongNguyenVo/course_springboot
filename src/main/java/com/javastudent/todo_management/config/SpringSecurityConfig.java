package com.javastudent.todo_management.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
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

    @Bean
    public InMemoryUserDetailsManager userDetails(){
        UserDetails user = User.builder()
                            .username("vonguyen")
                            .password("1234")
                            .roles("User")
                            .build();
        UserDetails admin = User.builder()
                            .username("admin")
                            .password("admin")
                            .roles("ADMIN")
                            .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
}
