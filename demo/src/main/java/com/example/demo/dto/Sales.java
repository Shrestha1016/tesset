package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Prod_Name;
	
	private int Cat_id;
	
	private int quantity;
	
	private double price;
	
	private double Amount;
	
	public Sales()	{
		
	}

	public Sales(String prod_Name, int cat_id, int quantity, double price, double amount) {
		super();
		Prod_Name = prod_Name;
		Cat_id = cat_id;
		this.quantity = quantity;
		this.price = price;
		Amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProd_Name() {
		return Prod_Name;
	}

	public void setProd_Name(String prod_Name) {
		Prod_Name = prod_Name;
	}

	public int getCat_id() {
		return Cat_id;
	}

	public void setCat_id(int cat_id) {
		Cat_id = cat_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "Sales [id=" + id + ", Prod_Name=" + Prod_Name + ", Cat_id=" + Cat_id + ", quantity=" + quantity
				+ ", price=" + price + ", Amount=" + Amount + "]";
	}
	
	
	

	
	
}
