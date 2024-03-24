package com.group4.fashionstarshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "variants")
public class ProductVariant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long variantId;
	private String variantName;
	private String variantSize;
	private String variantColor;
	private int stockQuanity;
	public Long getVariantId() {
		return variantId;
	}
	public void setVariantId(Long variantId) {
		this.variantId = variantId;
	}
	public String getVariantName() {
		return variantName;
	}
	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}
	public String getVariantSize() {
		return variantSize;
	}
	public void setVariantSize(String variantSize) {
		this.variantSize = variantSize;
	}
	public String getVariantColor() {
		return variantColor;
	}
	public void setVariantColor(String variantColor) {
		this.variantColor = variantColor;
	}
	public int getStockQuanity() {
		return stockQuanity;
	}
	public void setStockQuanity(int stockQuanity) {
		this.stockQuanity = stockQuanity;
	}
	
	
}
