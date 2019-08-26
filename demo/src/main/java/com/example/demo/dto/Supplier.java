package com.example.demo.dto;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Name;
	
	private String Contact;
	
	private String Address;
	
	private String[] products;
	
	
	
	
	public Supplier()	{
		
	}

	public Supplier( String name, String contact, String address, String[] products) {
		super();
		Name = name;
		Contact = contact;
		Address = address;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", Name=" + Name + ", Contact=" + Contact + ", Address=" + Address + ", products="
				+ Arrays.toString(products) + "]";
	}
	
	
	
	
}
