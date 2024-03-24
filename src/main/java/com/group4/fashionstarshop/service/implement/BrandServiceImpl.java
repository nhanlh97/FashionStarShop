package com.group4.fashionstarshop.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.fashionstarshop.model.Brand;
import com.group4.fashionstarshop.repository.BrandRepository;
import com.group4.fashionstarshop.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand updateBrand(Long id, Brand Brand) {
        Brand.setBrandId(id);
        return brandRepository.save(Brand);
    }

    @Override
    public Brand getBrand(Long id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBrand(Long id) {
    	brandRepository.deleteById(id);
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

}
