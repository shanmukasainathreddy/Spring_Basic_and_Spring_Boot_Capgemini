package com.capgemini.category_product.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.category_product.dao.CategoryRepository;
import com.capgemini.category_product.exception.CategoryNotFoundException;
import com.capgemini.category_products.dto.Category;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository = null;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found"));
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}