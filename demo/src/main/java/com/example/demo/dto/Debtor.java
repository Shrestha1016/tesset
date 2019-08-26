package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Debtor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Name;
	
	private String Contact;
	
	private String Address;
	
	private double Rem_Amount;
	
	
	public Debtor()	{
		
	}


	public Debtor(String name, String contact, String address, double rem_Amount) {
		super();
		Name = name;
		Contact = contact;
		Address = address;
		Rem_Amount = rem_Amount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		Contact = contact;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public double getRem_Amount() {
		return Rem_Amount;
	}


	public void setRem_Amount(double rem_Amount) {
		Rem_Amount = rem_Amount;
	}


	@Override
	public String toString() {
		return "Debtors [id=" + id + ", Name=" + Name + ", Contact=" + Contact + ", Address=" + Address
				+ ", Rem_Amount=" + Rem_Amount + "]";
	}
	
}
