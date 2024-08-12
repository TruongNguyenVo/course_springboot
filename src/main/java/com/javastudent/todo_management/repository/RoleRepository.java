package com.javastudent.todo_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastudent.todo_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
