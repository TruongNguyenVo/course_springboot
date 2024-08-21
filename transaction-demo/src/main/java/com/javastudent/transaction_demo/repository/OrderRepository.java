package com.javastudent.transaction_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastudent.transaction_demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    

}
