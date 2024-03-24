package com.group4.fashionstarshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_stores")
public class ProductStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productStoreId;
	private int productQuantity;
	private String productName;
	public int getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(int productStoreId) {
		this.productStoreId = productStoreId;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
