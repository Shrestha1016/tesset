package com.example.demo.dto;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String code;
	
	private String name;
	
	private String description;
	
	private double unitPrice;
	
	private int quantity;
	
	private int categoryId;
	
	private int supplierId;
	
	private int purchases;
	
	
	
	
	public Product()	{
		
		// Generator unique UUID(util package)
		this.code = "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	
	// Constructor
	public Product( String code, String name, String description, double unitPrice, int quantity,
			int categoryId, int supplierId, int purcahses) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.categoryId = categoryId;
		this.supplierId = supplierId;
		this.purchases = purchases;
	}


	
	
	
	
	// Getters and Setters
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	public int getPurchases() {
		return purchases;
	}


	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	
	
	// toString() method
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description="
				+ description + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", categoryId=" + categoryId
				+ ", supplierId=" + supplierId + ", purchases=" + purchases +   "]";
	}
	
	
	
}
