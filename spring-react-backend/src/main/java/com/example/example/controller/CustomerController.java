package com.example.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.example.model.Customer;
import com.example.example.repository.CustomerRepository;

@RestController
@RequestMapping("rest/api")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	// get all customers
	@GetMapping("/customers")
	public List<Customer> findAllCustomers(){
		return customerRepository.findAll();
	}
	
	// get  customer by id
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(long id){
		return customerRepository.getById((int) id);
	}

}
