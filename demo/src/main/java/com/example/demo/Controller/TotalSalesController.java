package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TotalSalesDAO;
import com.example.demo.dto.TotalSales;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TotalSalesController {

	@Autowired
	private TotalSalesDAO totalSalesDAO;
	
	@PutMapping(value="/Totalsales/updateTotalSales/{id}")
	public TotalSales updateTotalSales(@PathVariable int id,TotalSales totalSales)	{
		TotalSales updateTotalSales = totalSalesDAO.findById(id).orElse(null);
		if(updateTotalSales != null)	{
			updateTotalSales.setAmount(totalSales.getAmount());
			return totalSales;
		}
		return null;
		
	}
	
	@GetMapping(value="/TotalSales/getSales")
	public List<TotalSales> getAllDailySales()	{
		return totalSalesDAO.findAll();
	}
	
	
	@PostMapping(value="/sales/addTotalSales")
	public TotalSales addSales(TotalSales sales)	{
		TotalSales newSales = totalSalesDAO.save(new TotalSales(sales.getDate(),sales.getAmount()));
		return newSales;
	}

}
