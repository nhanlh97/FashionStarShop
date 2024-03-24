package com.group4.fashionstarshop.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.group4.fashionstarshop.controller.exception.ProductException;
import com.group4.fashionstarshop.dto.ProductDTO;
import com.group4.fashionstarshop.model.Product;

public interface ProductService {
	public Product createProduct(ProductDTO productDto);

	public String deleteProduct(Long proId) throws ProductException;

	public Product updateProduct(Long proId, Product req) throws ProductException;

	public Product findProductByld(Long id) throws ProductException;

	public List<Product> findProductByCategory(String category);
	
	public List<Product> listProducts();

	public Page<Product> getAllProduct(String category, Double minPrice, Double maxPrice, Double price, String sort, String stock, Integer pageNumber, Integer pageSize);
}
