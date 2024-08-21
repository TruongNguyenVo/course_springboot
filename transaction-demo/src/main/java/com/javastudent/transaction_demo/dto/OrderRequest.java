package com.javastudent.transaction_demo.dto;

import com.javastudent.transaction_demo.entity.Order;
import com.javastudent.transaction_demo.entity.Payment;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class OrderRequest {
    private Order order;
    private Payment payment;


}
