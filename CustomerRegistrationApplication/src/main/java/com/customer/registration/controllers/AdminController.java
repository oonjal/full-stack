package com.customer.registration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.customer.registration.model.Customer;
import com.customer.registration.service.CustomerServiceImpl;

@RestController
public class AdminController {

	@Autowired
	CustomerServiceImpl customerService;
	
	@GetMapping(value = "/removeCustomer")
	public ModelAndView show() {
		return new ModelAndView("removeCustomer", "cust", new Customer());
	}
	
	@PostMapping(value = "/removeCustomer")
	public ModelAndView deleteCustomer(@ModelAttribute("cust") Customer cust) {
		
		customerService.removeCustomer(cust);
		List<Customer> customers = null;
		ModelAndView model = new ModelAndView("remove");
		model.addObject("customers", customers);
		return model;
	}
}
