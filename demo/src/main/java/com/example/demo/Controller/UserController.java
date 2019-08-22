package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	 @Autowired
	 private UserDAO userDAO;
	
	
	 @GetMapping(value="/getUsers")
	 public List<User> getUsers()	{
		 return userDAO.findAll();
	 }
	 
	@PostMapping(value="/user/create")
	public User postUser(@RequestBody User user)	{
		User newUser = userDAO.save(new User(user.getFirstName(),user.getLastName(),user.getEmail(),user.getContactNumber(),user.getRole(),user.getPassword(),user.getPassword()));
		return newUser;
	}
	

}
