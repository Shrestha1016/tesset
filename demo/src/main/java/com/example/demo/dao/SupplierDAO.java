package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Supplier;

public interface SupplierDAO extends JpaRepository<Supplier, Integer> {

}
