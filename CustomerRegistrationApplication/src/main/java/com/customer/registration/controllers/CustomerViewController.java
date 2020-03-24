package com.customer.registration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.customer.registration.model.Customer;
import com.customer.registration.service.CustomerServiceImpl;

@RestController
public class CustomerViewController {

	@Autowired
	CustomerServiceImpl customerService;

	@RequestMapping("/getCustomers")
	public ModelAndView getCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		ModelAndView model = new ModelAndView("getCustomers");
		model.addObject("customers", customers);
		return model;
	}

	@RequestMapping("/getCustomer")
	public ModelAndView getCustomer(String custId) {
		Customer customer = customerService.getCustomerById(custId);
		ModelAndView model = new ModelAndView("getCustomers");
		model.addObject("customer", customer);
		return model;
	}

}
