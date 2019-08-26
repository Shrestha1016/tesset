package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.Category;
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
		return productDAO.findByCategoryId(id);
	}
	
	@PostMapping(value="/product/addProduct")
	public Product addSales(Product product)	{
		Product newSales = productDAO.save(new Product(product.getCode(),product.getName(),product.getDescription(),product.getUnitPrice(),product.getQuantity(),product.getCategoryId(),product.getSupplierId(),product.getPurchases()));
		return newSales;
	}
	
	
	@PutMapping(value="/product/update/{id}")
	public Product updateSalesByName(@PathVariable int id,Product product)	{
		Product updateProduct = productDAO.findById(id).orElse(null);
		if(updateProduct != null)	{
			updateProduct.setName(product.getName());
			updateProduct.setDescription(product.getDescription());
			updateProduct.setCategoryId(product.getCategoryId());
			updateProduct.setCode(product.getCode());
			updateProduct.setPurchases(product.getPurchases());
			updateProduct.setQuantity(product.getPurchases());
			updateProduct.setUnitPrice(product.getUnitPrice());
			updateProduct.setSupplierId(product.getSupplierId());
			return product;
		}
		return null;
		
	}
	
	@DeleteMapping(value="/product/Delete/{id}")
	void deleteSales(@PathVariable int id)	{
		productDAO.deleteById(id);
	}
	
	
	


}
