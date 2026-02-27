package com.capgemini.category_product.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.category_products.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductNameContainingIgnoreCase(String productName);
}
