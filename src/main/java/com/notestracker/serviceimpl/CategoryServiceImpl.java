package com.notestracker.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.notestracker.entity.Category;
import com.notestracker.repositiory.CategoryRepositiory;
import com.notestracker.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepositiory categoryRepositiory;

	@Override
	public boolean saveCategory(Category category) {
		category.setDeleted(false);
		category.setCreatedBy(1);

		Category saveCategory = categoryRepositiory.save(category);
		if (ObjectUtils.isEmpty(saveCategory)) {
			return false;
		}
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> categories = categoryRepositiory.findAll();
		return categories;
	}

}
