package com.capgemini.category_product.dao;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryJpaRepository extends JpaRepository<Category, Integer>{

}