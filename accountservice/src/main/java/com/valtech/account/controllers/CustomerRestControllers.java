package com.valtech.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Customer;
import com.valtech.account.service.CustomerService;

@RestController
public class CustomerRestControllers {

	@Autowired
    private CustomerService customerservice;
	
	@PostMapping("/api/Customer")
	public Customer createCustomer( @RequestBody Customer cus) {
		return customerservice.createCustomer(cus);
	}

	@PutMapping("/api/Customer/{id}")
	public Customer updateCustomer(@RequestBody Customer cus,@PathVariable int id) {
		return customerservice.updateCustomer(cus);
	}
	@GetMapping("/api/Customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerservice.getCustomer(id);
	}

	@GetMapping("/api/Customer")
	public List<Customer> getAllCustomer() {
		return customerservice.getAllCustomer();
	}
	
//	@PutMapping("/api/Customer/{id}")
	





//	@PostMapping("/api/Customer")
//	public Customer createCustomer( Customer customer) {
//	    return customerservice.createAccount(customer);
//	}
//
//
//
//
//
//	@GetMapping("/api/Customers/{id}")
//	public Customer getCustomer(@PathVariable("id") int id) {
//	    return customerservice.getCustomer(id);
//	}
//
//
//
//
//
//	@GetMapping("/api/Customer")
//	public List<Customer> getCustomers() {
//	    return customerservice.getAllCustomers();
//	}


	
}
