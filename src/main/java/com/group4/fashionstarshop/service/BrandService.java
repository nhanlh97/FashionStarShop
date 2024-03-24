package com.group4.fashionstarshop.service;

import java.util.List;

import com.group4.fashionstarshop.model.Brand;

public interface BrandService {
	 	Brand createBrand(Brand brand);
	    Brand updateBrand(Long id, Brand brand);
	    Brand getBrand(Long id);
	    void deleteBrand(Long id);
	    List<Brand> getAllBrands();
}
