package com.javastudent.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastudent.webservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
