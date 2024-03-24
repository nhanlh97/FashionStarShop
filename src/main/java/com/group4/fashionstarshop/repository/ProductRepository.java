package com.group4.fashionstarshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group4.fashionstarshop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p " + "WHERE(p.category.categoryName=: category OR :category='')"
			+ "AND((:minPrice IS NULL AND :maxPrice IS NULL)OR(p.productPrice BETWEEN :minPrice and :maxPrice))"
			+ "AND (:price IS NULL OR p.productPrice>= : price) " + "ORDER BY "
			+ "CASE WHEN :sort = 'price_low' THEN p.productPrice END ASC, "
			+ "CASE WHEN :sort = 'price_high' THEN p.productPrice END DESC ")
	public List<Product> filterProducts(@Param("category") String category, @Param("minPrice") Double minPrice,
			@Param("maxPrice") Double maxPrice, @Param("price") Double price, @Param("sort") String sort);
}
