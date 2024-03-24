package com.group4.fashionstarshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.group4.fashionstarshop.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	@Query("SELECT c FROM Category c WHERE c.categoryName = :catName")
	public Category findByName(@Param("catName")String catName);
	
	@Query("SELECT c FROM Category c WHERE c.categoryName=:name AND c.parentCategory.categoryName=:parentCategoryName")
	public Category findByNameAndParant(@Param("name") String name, @Param("parentCategoryName") String parentCategoryName);
}
