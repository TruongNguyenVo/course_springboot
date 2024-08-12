package com.javastudent.todo_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize) -> {
            authorize.requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN");
            authorize.anyRequest().authenticated();
        }).httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                                .username("nguyenvo")
                                .password(passwordEncoder().encode("12345"))
                                .roles("USER")
                                .build();
        UserDetails admin = User.builder()
                                .username("admin")
                                .password(passwordEncoder().encode("admin"))
                                .roles("ADMIN")
                                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
