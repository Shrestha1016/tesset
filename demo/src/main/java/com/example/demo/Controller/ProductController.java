package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.Product;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	 @Autowired
	 private ProductDAO productDAO;
	
	
	@GetMapping(value="/allProduct")
	public List<Product> viewProduct()	{
		return productDAO.findAll();
	}
	
	
	
	@GetMapping(value="/product/byCategoryId/{id}")
	public List<Product> viewProduct(@PathVariable int id)	{
		System.out.println(productDAO.findByCategoryId(id));
		return productDAO.findByCategoryId(id);
	}

}
