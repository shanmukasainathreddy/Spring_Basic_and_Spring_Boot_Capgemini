
package com.capgemini.category_product.controller;

import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cagemini.category_product.exception.CategoryNotFoundException;
import com.capgemini.category_product.dao.CategoryJpaRepository;

@RestController
public class CategoryController {

	@Autowired
	 CategoryJpaRepository categoryjpa;
	
//	@PostMapping("/add")
//	public Category addCategory(@RequestBody Category c) {
//		
//		return categoryjpa.save(c);
//		
//	}
	
//	@GetMapping("/categories/{page}/{size}")
//	public List<Category> getCategory(@PathVariable int page,@PathVariable int size) {
//		
//		Page<Category> p=categoryjpa.findAll(PageRequest
//				.of(page, size,Sort.by("id").descending()));
//		
//		return p.getContent();
//	}
	
	@GetMapping("/get-id/{id}")
	public ResponseEntity<Category> getById(@PathVariable int id){
		Optional<Category> optional = categoryjpa.findById(id);
		Category c = null;
		if(optional.isPresent()) {
			c = optional.get();
			return new ResponseEntity<Category>(c,HttpStatus.FOUND);
		}else {
//			return new ResponseEntity<Category>(c,HttpStatus.NOT_FOUND);
			throw new CategoryNotFoundException("category not found id : " + id);
		}
	}
}
