package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Debtor;

public interface DebtorDAO extends JpaRepository<Debtor,Integer> {

}
