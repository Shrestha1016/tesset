package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer> {
	
}
