package com.notestracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notestracker.entity.Category;
import com.notestracker.service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/save-category")
	public ResponseEntity<?> saveCategory(@RequestBody Category category){
		boolean saveCategory = categoryService.saveCategory(category);
		if(saveCategory) {
		return new ResponseEntity<>("saved succsess",HttpStatus.CREATED);
		}else 
			return new ResponseEntity<>("not saved ",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/category")
	public ResponseEntity<?> getAllCategory(){
		 List<Category> allCategory = categoryService.getAllCategory();
		 if (allCategory == null || allCategory.isEmpty()) {
			    System.out.println("The collection is empty.");
			    return ResponseEntity.noContent().build();
			}else
				return new ResponseEntity<>(allCategory,HttpStatus.OK);
	
	}
}
