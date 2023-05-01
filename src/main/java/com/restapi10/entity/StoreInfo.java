package com.restapi10.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Entity
public class StoreInfo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
	private int productId;
@Column
	private String productName;
@Column
	private int productQuantity;
public StoreInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public StoreInfo(int productId, String productName, int productQuantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productQuantity = productQuantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}


	
}
