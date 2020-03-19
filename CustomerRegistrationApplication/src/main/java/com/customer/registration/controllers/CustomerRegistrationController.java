package com.customer.registration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.customer.registration.model.Customer;
import com.customer.registration.service.CustomerServiceImpl;

@RestController
public class CustomerRegistrationController {

	@Autowired
	CustomerServiceImpl customerService;

	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@GetMapping(value = "/addCustomer")
	public ModelAndView show() {
		return new ModelAndView("addCustomer", "cust", new Customer());
	}

	@PostMapping(value = "/addCustomer")
	public ModelAndView processRequest(@ModelAttribute("cust") Customer cust) {
		
		customerService.insertCustomer(cust);
		List<Customer> customers = null;
		ModelAndView model = new ModelAndView("success");
		model.addObject("customers", customers);
		return model;
	}
	
}
