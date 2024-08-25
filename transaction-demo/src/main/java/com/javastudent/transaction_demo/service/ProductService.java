package com.javastudent.transaction_demo.service;

import java.util.List;

import com.javastudent.transaction_demo.entity.Product;

public interface  ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
