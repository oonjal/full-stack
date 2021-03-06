/*package com.cognizant.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.EducationLoanDetails;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.EducationLoanService;;

@Controller
public class EducationLoanController {
	EducationLoanController(){
		
	}
	
	@Autowired
	EducationLoanService applicationService;
	
	*//**
	 * method created for validation.
	 *//*
	@Autowired
	@Qualifier("educationLoanvalidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	*//**
	 * @return
	 * redirect to the index page
	 *//*
	@RequestMapping("/HomePage") 
	public ModelAndView index() { 
		return new ModelAndView("HomePage", "message", "");
	}
	
	@RequestMapping("/login") 
	public ModelAndView login() { 
		return new ModelAndView("Home", "message", "");
	}
	
	*//**
	 * @return
	 * redirect to the home page
	 *//*
	@RequestMapping("/homepage") 
	public ModelAndView homepage() { 
		return new ModelAndView("Home", "message", "");
	}
	

	
	*//**
	 * @param model
	 * @return
	 * Navigate to the application form page and gets the input from the user. 
	 *//*
	@RequestMapping("/applyloan")
	public String applyloan(Model model) {
		EducationLoanDetails educationLoanDetails = new EducationLoanDetails();
		educationLoanDetails.setUserDetails(new UserDetails());
		model.addAttribute("applyloan",educationLoanDetails);
		return "ApplyEducationLoan";
		
	}
	
	*//**
	 * @return
	 * Fetch the loan details from the database based on the user input.
	 *//*
	@RequestMapping("/loandetails")
	public ModelAndView loandetails() {
		return new ModelAndView("FetchLoanDetails", "message", "");
	}
	
	
	*//**
	 * @param applyloan
	 * @param result
	 * @param model
	 * @return
	 * Inserts the user loan details in to the database and 
	 * display the loan account number and id number on successful completion 
	 *//*
	
	@RequestMapping(value = "/navigate", method = RequestMethod.POST)
	public String eduLoan(@ModelAttribute("applyloan")EducationLoanDetails applyloan, BindingResult result, ModelMap model) {
		
		 if(result.hasErrors()) {
			 return "ApplyEducationLoan";
		 }
		 String display = applicationService.insert(applyloan);
		 model.addAttribute("model", display);
		 return "Applied";
	}


	
    }
	

*/