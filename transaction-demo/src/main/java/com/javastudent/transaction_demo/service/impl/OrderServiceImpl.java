package com.javastudent.transaction_demo.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javastudent.transaction_demo.dto.OrderRequest;
import com.javastudent.transaction_demo.dto.OrderResponse;
import com.javastudent.transaction_demo.entity.Order;
import com.javastudent.transaction_demo.entity.Payment;
import com.javastudent.transaction_demo.exception.PaymentException;
import com.javastudent.transaction_demo.repository.OrderRepository;
import com.javastudent.transaction_demo.repository.PaymentRepository;
import com.javastudent.transaction_demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository){
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional(rollbackFor= PaymentException.class)
    public OrderResponse placeOrder(OrderRequest orderRequest) {


        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if (!payment.getType().equals("DEBIT")) {
            throw new PaymentException("Payment card type do no support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCESS");
        
        return orderResponse;
    }

}
