package com.group4.fashionstarshop.service.implement;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.group4.fashionstarshop.controller.exception.ProductException;
import com.group4.fashionstarshop.dto.ProductDTO;
import com.group4.fashionstarshop.model.Brand;
import com.group4.fashionstarshop.model.Category;
import com.group4.fashionstarshop.model.Product;
import com.group4.fashionstarshop.repository.BrandRepository;
import com.group4.fashionstarshop.repository.CategoryRepository;
import com.group4.fashionstarshop.repository.ProductRepository;
import com.group4.fashionstarshop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Product createProduct(ProductDTO productDto) {
		Category topLevel = categoryRepository.findByName(productDto.getTopLevelCategory());
		if (topLevel == null) {
			Category topLevelCategory = new Category();
			topLevelCategory.setCategoryName(productDto.getTopLevelCategory());
			topLevelCategory.setLevel(1);
			topLevel = categoryRepository.save(topLevelCategory);
		}
		Category secondLevel = categoryRepository.findByNameAndParant(productDto.getSecondLevelCategory(),
				topLevel.getCategoryName());
		if (secondLevel == null) {
			Category secondLevelCategory = new Category();
			secondLevelCategory.setCategoryName(productDto.getSecondLevelCategory());
			secondLevelCategory.setParentCategory(topLevel);
			secondLevelCategory.setLevel(2);
			secondLevel = categoryRepository.save(secondLevelCategory);
		}
		Category thirdLevel = categoryRepository.findByNameAndParant(productDto.getThirdLevelCategory(),
				topLevel.getCategoryName());
		if (thirdLevel == null) {
			Category thirdLevelCategory = new Category();
			thirdLevelCategory.setCategoryName(productDto.getThirdLevelCategory());
			thirdLevelCategory.setParentCategory(secondLevel);
			thirdLevelCategory.setLevel(3);
			
			thirdLevel = categoryRepository.save(thirdLevelCategory);
		}
		Product product = new Product();
		product.setProductName(productDto.getProductName());
		product.setProductPrice(productDto.getProductPrice());
		product.setProductQuantity(productDto.getProductQuantity());
		product.setProductDescription(productDto.getProductDescription());
		product.setSKU(productDto.getSKU());
		product.setFullDescription(productDto.getFullDescription());
		product.setProductImage(productDto.getProductImage());
		product.setCategory(thirdLevel);
		product.setBrand((Brand) productDto.getBrand());
		
		Product savedProduct = productRepository.save(product);
		
		
		return savedProduct;
	}

	@Override
	public String deleteProduct(Long proId) throws ProductException {
		Product product = findProductByld(proId);
		((Set<Brand>) product.getBrand()).clear();
		productRepository.delete(product);
		return "Product deleted";
	}

	@Override
	public Product updateProduct(Long proId, Product req) throws ProductException {
		Product product = findProductByld(proId);
		if (req.getProductQuantity() !=0 ) {
			product.setProductQuantity(req.getProductQuantity());
		}
		return productRepository.save(product);
	}

	@Override
	public Product findProductByld(Long id) throws ProductException {
		Optional<Product> opt = productRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new ProductException("Product not found with " + id);
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String category, Double minPrice, Double maxPrice, Double price,
			String sort, String stock, Integer pageNumber, Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize); 
		List<Product> products = productRepository.filterProducts(category, minPrice, maxPrice, price, sort);
		return null;
	}

	@Override
	public List<Product> listProducts() {
		
		return productRepository.findAll();
	}

}
