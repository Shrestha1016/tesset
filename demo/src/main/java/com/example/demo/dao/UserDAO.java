package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.User;

@CrossOrigin(origins = "http://localhost:4200")
public interface UserDAO extends JpaRepository<User, Integer>{

}
