package com.customer.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.registration.dao.CustomerDaoImpl;
import com.customer.registration.model.Customer;

@Service
public class CustomerServiceImpl {

	@Autowired
	CustomerDaoImpl customerDaoImpl;

	public void insertCustomer(Customer customer) {
		customerDaoImpl.insertCustomer(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerDaoImpl.getAllCustomers();
	}

	public Customer getCustomerById(String empId) {
		Customer customer = customerDaoImpl.getCustomerById(empId);
		return customer;
	}
}
