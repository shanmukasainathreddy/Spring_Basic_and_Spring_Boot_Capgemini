package com.capgemini.category_product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.category_product.service.ProductService;
import com.capgemini.category_products.dto.Product;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	@Autowired
    ProductService productService;

    @PostMapping("/{categoryId}")
    public Product createProduct(@RequestBody Product product,
                                 @PathVariable Long categoryId) {
        return productService.createProduct(product, categoryId);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String name) {
        return productService.searchProduct(name);
    }
}