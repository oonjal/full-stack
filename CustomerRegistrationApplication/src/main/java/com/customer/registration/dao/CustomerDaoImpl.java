package com.customer.registration.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.customer.registration.model.Customer;

@Repository
public class CustomerDaoImpl {

	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer getCustomerById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> list = new ArrayList<Customer>();
		
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		Customer cust3 = new Customer();
		
		cust1.setCustId("1");
		cust1.setCustName("Customer");
		
		cust2.setCustId("2");
		cust2.setCustName("Admin");
		
		cust3.setCustId("3");
		cust3.setCustName("Employer");
		
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		
		// TODO Auto-generated method stub
		return list;
	}

	public void insertCustomers(java.util.List<Customer> customers) {
		// TODO Auto-generated method stub
		
	}

}
