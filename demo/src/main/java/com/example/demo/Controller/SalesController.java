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

import com.example.demo.dao.SalesDAO;
import com.example.demo.dto.Sales;
import com.example.demo.dto.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SalesController {
	
	@Autowired
	private SalesDAO salesDAO;
	
	
	@PutMapping(value="/sales/updateDailySales/{id}")
	public Sales updateSalesByName(@PathVariable int id,Sales sales)	{
		Sales updateSales = salesDAO.findById(id).orElse(null);
		if(updateSales != null)	{
			updateSales.setProd_Name(sales.getProd_Name());
			updateSales.setCat_id(sales.getCat_id());
			updateSales.setAmount(sales.getAmount());
			updateSales.setPrice(sales.getPrice());
			updateSales.setQuantity(sales.getQuantity());
			return sales;
		}
		return null;
		
	}
	
	
	@GetMapping(value="/show/User/{id}")
	public  Sales showCategoryProducts(@PathVariable int id)	{
		Sales sales = null;
		sales = salesDAO.findById(id).orElse(null);
		return sales;
	}
	
	@GetMapping(value="/sales/getDailySales")
	public List<Sales> getAllDailySales()	{
		return salesDAO.findAll();
	}
	
	
	@PostMapping(value="/sales/addDailySales")
	public Sales addSales(Sales sales)	{
		Sales newSales = salesDAO.save(new Sales(sales.getProd_Name(),sales.getCat_id(),sales.getQuantity(),sales.getPrice(),sales.getAmount()));
		return newSales;
	}
	
	@DeleteMapping(value="/sales/Delete/{id}")
	void deleteSales(@PathVariable int id)	{
		salesDAO.deleteById(id);
	}
	
	
}
