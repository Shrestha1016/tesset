package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

	
	 
	List<Product> findByCategoryId(int cat_id);

}
