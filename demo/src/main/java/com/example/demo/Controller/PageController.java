package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.dto.Product;
import com.example.demo.dto.User;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PageController {
	
//	@Autowired
//	private CategoryDAO categoryDAO;
//	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired 
	private UserDAO userDAO; 
//	
//	
//	
//	
//	@GetMapping(value="/show/all/products")
//	public  List<Category> showAllProducts(Model model)	{
//		model.addAttribute("listAll", true);
//		return categoryDAO.findAll();
//	}
//	
//	
//	@GetMapping(value="/show/category/{id}/products")
//	public  Category showCategoryProducts(@PathVariable int id)	{
//		Category category = null;
//		category = categoryDAO.findById(id).orElse(null);
//		return category;
//		
//		
//	}
//	
//	
//	@GetMapping(value="/test")
//	public List<Product> viewProduct()	{
//		return productDAO.findAll();
//	}
//	
	
	
	@GetMapping(value="/product/byCategoryId/{id}")
	public List<Product> viewProduct(@PathVariable int id)	{
		return productDAO.findByCategoryId(id);
	}
	
	@PostMapping(value="/user/create")
	public User postCustomer(@RequestBody User user)	{
		User newUser = userDAO.save(new User(user.getFirstName(),user.getLastName(),user.getEmail(),user.getContactNumber(),user.getRole(),user.getPassword(),user.getPassword()));
		return newUser;
	}
	
	
}
