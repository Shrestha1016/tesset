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

import com.example.demo.dao.DebtorDAO;
import com.example.demo.dto.Category;
import com.example.demo.dto.Debtor;
import com.example.demo.dto.Sales;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DebtorController {

	@Autowired
	private DebtorDAO debtorDAO;
	
	
	@GetMapping(value="/Debtor/debtors")
	public List<Debtor> getAllDebtor()	{
		return debtorDAO.findAll();
	}
	
	@GetMapping(value="/show/debtor/{id}")
	public  Debtor showDebtorById(@PathVariable int id)	{
		Debtor debtor = null;
		debtor = debtorDAO.findById(id).orElse(null);
		return debtor;
	}
	
	
	@PostMapping(value="/debtor/addDebtor")
	public Debtor addDebtor(Debtor debtor)	{
		Debtor newDebtor = debtorDAO.save(new Debtor(debtor.getName(),debtor.getContact(),debtor.getAddress(),debtor.getRem_Amount()));
		return newDebtor;
	}
	
	@PutMapping(value="/debtor/update/{id}")
	public Debtor updateDebtor(@PathVariable int id,Debtor debtor)	{
		Debtor updateDebtor = debtorDAO.findById(id).orElse(null);
		if(updateDebtor != null)	{
			updateDebtor.setName(debtor.getName());
			updateDebtor.setAddress(debtor.getAddress());
			updateDebtor.setContact(debtor.getContact());
			updateDebtor.setRem_Amount(debtor.getRem_Amount());
			return debtor;
		}
		return null;
		
	}
	
	@DeleteMapping(value="/debtor/Delete/{id}")
	void deleteDebtor(@PathVariable int id)	{
		debtorDAO.deleteById(id);
	}
	
	
	
	
}
