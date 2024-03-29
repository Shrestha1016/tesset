package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	// private fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;
	

	// Constructor
	public Category() {

	}

	public Category( String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description 
				+ "]";
	}

	
	
	
}
