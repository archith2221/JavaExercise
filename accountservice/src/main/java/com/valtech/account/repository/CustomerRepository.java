package com.valtech.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtech.account.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
