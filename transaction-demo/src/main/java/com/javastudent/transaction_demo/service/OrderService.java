package com.javastudent.transaction_demo.service;

import com.javastudent.transaction_demo.dto.OrderRequest;
import com.javastudent.transaction_demo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
    
}
