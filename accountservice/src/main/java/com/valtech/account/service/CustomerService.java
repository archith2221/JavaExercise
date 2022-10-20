package com.valtech.account.service;

import java.util.List;

import com.valtech.account.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer cus);

	Customer updateCustomer(Customer cus);

	Customer getCustomer(int id);

	List<Customer> getAllCustomer();

//	Customer updateAccount(Customer customer);
//
//	Customer createAccount(Customer customer);
//
//	List<Customer> getAllCustomers();

}