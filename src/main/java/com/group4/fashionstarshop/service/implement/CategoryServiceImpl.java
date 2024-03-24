package com.group4.fashionstarshop.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.fashionstarshop.model.Category;
import com.group4.fashionstarshop.repository.CategoryRepository;
import com.group4.fashionstarshop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Long id, Category category) {
		 category.setCategoryId(id);
	     return categoryRepository.save(category);
	}

	@Override
	public Category getCategory(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
		
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

}
