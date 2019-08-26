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

import com.example.demo.dao.SupplierDAO;
import com.example.demo.dto.Product;
import com.example.demo.dto.Sales;
import com.example.demo.dto.Supplier;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SupplierController {


	@Autowired
	private SupplierDAO supplierDAO;
	
	
	@PutMapping(value="/Supplier/updateSupplier/{id}")
	public Supplier updateSupplier(@PathVariable int id,Supplier supplier)	{
		Supplier updateSupplier = supplierDAO.findById(id).orElse(null);
		if(updateSupplier != null)	{
			updateSupplier.setName(supplier.getName());
			updateSupplier.setAddress(supplier.getAddress());
			updateSupplier.setContact(supplier.getContact());
			updateSupplier.setProducts(supplier.getProducts());
			return updateSupplier;
		}
		return null;
		
	}
	
	@GetMapping(value="/Supplier/getSupplierById/{id}")
	public Supplier viewProduct(@PathVariable int id)	{
		return supplierDAO.findById(id).orElse(null);
	}
	
	@GetMapping(value="/Supplier/getSupplier")
	public List<Supplier> getAllDailySales()	{
		return supplierDAO.findAll();
	}
	
	
	@PostMapping(value="/Supplier/addSupplier")
	public Supplier addSales(Supplier supplier)	{
		Supplier newSupplier = supplierDAO.save(new Supplier(supplier.getName(),supplier.getContact(),supplier.getAddress(),supplier.getProducts()));
		return newSupplier;
	}
	
	@DeleteMapping(value="/Supplier/Delete/{id}")
	void deleteSales(@PathVariable int id)	{
		supplierDAO.deleteById(id);
	}
	
	
	
}
