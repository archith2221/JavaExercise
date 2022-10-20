package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.account.entity.Customer;
import com.valtech.account.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	

	@Autowired
	private CustomerRepository customerepository;
	
	@Override
	public Customer createCustomer(Customer cus){
		
		return customerepository.save(cus);
	}
	
	@Override
	public Customer updateCustomer(Customer cus){
		
		return customerepository.save(cus);
		
	}
	
	
	@Override
	public Customer getCustomer(int id){
		return customerepository.findById(id).get();
		
	}
	
	@Override
	public List<Customer>getAllCustomer(){
		return customerepository.findAll();
		
	}

//	@Override
//	public Customer updateAccount(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer createAccount(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Customer> getAllCustomers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
