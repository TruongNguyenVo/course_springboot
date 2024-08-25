package com.javastudent.transaction_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javastudent.transaction_demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE" +
            "p.name LIKE CONCAT('%',: query, '%')" +
            "OR p.description LIKE CONCAT('%', : query, '%')")
    List<Product> searchProducts(String query);   

    @Query(value="SELECT * FROM products p WHERE" +
    "p.name LIKE CONCAT('%',: query, '%')" +
    "OR p.description LIKE CONCAT('%', : query, '%')", nativeQuery=true)
    List<Product> searchProductsSQL(String query);   
}
