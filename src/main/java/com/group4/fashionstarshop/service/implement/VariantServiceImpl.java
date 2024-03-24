package com.group4.fashionstarshop.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.group4.fashionstarshop.model.ProductVariant;
import com.group4.fashionstarshop.repository.VariantRepository;
import com.group4.fashionstarshop.service.VariantService;

public class VariantServiceImpl implements VariantService {

	@Autowired
	private VariantRepository variantRepository;
	@Override
	public ProductVariant createVariant(ProductVariant variant) {
		// TODO Auto-generated method stub
		return variantRepository.save(variant);
	}

	@Override
	public ProductVariant updateVariant(Long id, ProductVariant variant) {
		variant.setVariantId(id);
		return variantRepository.save(variant);
	}

	@Override
	public ProductVariant getVariant(Long id) {
		
		return variantRepository.findById(id).orElseThrow(null);
	}

	@Override
	public List<ProductVariant> getAllVariants() {
		
		return variantRepository.findAll();
	}
	
}
