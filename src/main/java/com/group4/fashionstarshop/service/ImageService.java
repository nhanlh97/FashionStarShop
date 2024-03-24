package com.group4.fashionstarshop.service;

import org.springframework.web.multipart.MultipartFile;

import com.group4.fashionstarshop.model.ProductImage;

public interface ImageService {
	 public ProductImage save(MultipartFile file) throws Exception;
}
