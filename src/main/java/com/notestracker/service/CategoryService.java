package com.notestracker.service;

import java.util.List;

import com.notestracker.entity.Category;

public interface CategoryService {
	
	public boolean saveCategory(Category category) ;
	public List<Category> getAllCategory();
	

}
