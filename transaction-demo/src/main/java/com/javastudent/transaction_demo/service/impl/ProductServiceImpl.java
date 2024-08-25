package com.javastudent.transaction_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javastudent.transaction_demo.entity.Product;
import com.javastudent.transaction_demo.repository.ProductRepository;
import com.javastudent.transaction_demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
