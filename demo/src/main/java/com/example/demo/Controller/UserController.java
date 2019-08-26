package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.Category;
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
	 
	@PostMapping(value="/user/addUser")
	public User postUser(@RequestBody User user)	{
		User newUser = userDAO.save(new User(user.getFirstName(),user.getLastName(),user.getEmail(),user.getContactNumber(),user.getRole(),user.getPassword(),user.getPassword()));
		return newUser;
	}
	
	@GetMapping(value="/show/User/{id}")
	public  User showCategoryProducts(@PathVariable int id)	{
		User user = null;
		user = userDAO.findById(id).orElse(null);
		return user;
	}
	
	@PutMapping(value="/user/update/{id}")
	public User updateSalesByName(@PathVariable int id,User user)	{
		User updateUser = userDAO.findById(id).orElse(null);
		if(updateUser != null)	{
			updateUser.setFirstName(user.getFirstName());
			updateUser.setLastName(user.getLastName());
			updateUser.setEmail(user.getEmail());
			updateUser.setConfirmPassword(user.getConfirmPassword());
			updateUser.setRole(user.getRole());
			updateUser.setContactNumber(user.getContactNumber());
			updateUser.setPassword(user.getPassword());
			return user;
		}
		return null;
		
	}
	
	@DeleteMapping(value="/user/Delete/{id}")
	void deleteSales(@PathVariable int id)	{
		userDAO.deleteById(id);
	}

}
