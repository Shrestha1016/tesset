package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategoryDAO;
import com.example.demo.dao.ProductDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.dto.Category;
import com.example.demo.dto.Sales;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@GetMapping(value="/Category/products")
	public  List<Category> showAllProducts(Model model)	{
		model.addAttribute("listAll", true);
		return categoryDAO.findAll();
	}
	
	
//	@GetMapping(value="/show/category/{id}/products")
//	public  Category showCategoryProducts(@PathVariable int id)	{
//		Category category = null;
//		category = categoryDAO.findById(id).orElse(null);
//		return category;
//	}
	
	
	@PostMapping(value="/category/addCategory")
	public Category addSales(Category category)	{
		Category newSales = categoryDAO.save(new Category(category.getName(),category.getDescription()));
		return newSales;
	}
	
	
	@PutMapping(value="/category/update/{id}")
	public Category updateSalesByName(@PathVariable int id,Category category)	{
		Category updateCategory = categoryDAO.findById(id).orElse(null);
		if(updateCategory != null)	{
			updateCategory.setName(category.getName());
			updateCategory.setDescription(category.getDescription());
			return category;
		}
		return null;
		
	}
	
	@DeleteMapping(value="/category/Delete/{id}")
	void deleteSales(@PathVariable int id)	{
		categoryDAO.deleteById(id);
	}
	

	
}
