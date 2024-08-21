package com.javastudent.transaction_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastudent.transaction_demo.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
}
