package com.capgemini.category_product.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.category_products.dto.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByCategoryName(String categoryName);
}