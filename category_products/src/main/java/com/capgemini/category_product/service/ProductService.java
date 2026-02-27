package com.capgemini.category_product.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.category_product.dao.CategoryRepository;
import com.capgemini.category_product.dao.ProductRepository;
import com.capgemini.category_product.exception.CategoryNotFoundException;
import com.capgemini.category_products.dto.Category;
import com.capgemini.category_products.dto.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository = null;
    private final CategoryRepository categoryRepository = null;

    public Product createProduct(Product product, Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found"));

        product.setCategory(category);
        return productRepository.save(product);
    }

    public List<Product> searchProduct(String name) {
        return productRepository.findByProductNameContainingIgnoreCase(name);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}