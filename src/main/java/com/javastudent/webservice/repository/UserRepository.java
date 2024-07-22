package com.javastudent.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javastudent.webservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
