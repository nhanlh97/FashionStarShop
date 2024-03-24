package com.group4.fashionstarshop.service;

import java.util.List;

import com.group4.fashionstarshop.model.Category;

public interface CategoryService {
	Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    Category getCategory(Long id);
    void deleteCategory(Long id);
    List<Category> getAllCategories();
}
