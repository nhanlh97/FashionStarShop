package com.group4.fashionstarshop.service;

import java.util.List;

import com.group4.fashionstarshop.model.ProductVariant;

public interface VariantService {
 	ProductVariant createVariant(ProductVariant variant);
    ProductVariant updateVariant(Long id, ProductVariant variant);
    ProductVariant getVariant(Long id);
    List<ProductVariant> getAllVariants();
}
