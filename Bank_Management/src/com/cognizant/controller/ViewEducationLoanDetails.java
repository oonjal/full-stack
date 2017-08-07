/*package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.EducationLoanDetails;
import com.cognizant.service.ApplicationService;

@RestController
public class ViewEducationLoanDetails {

	@Autowired
	ApplicationService applicationService;
	
	*//**
	 * Fetch the user loan details from the database and display to the user 
	 * @return 
	 *//*
	
	
	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<EducationLoanDetails> fetchLoan(@RequestParam("educationLoanId") String educationLoanId, 
			@RequestParam("eduLoanAccountNumber") String eduLoanAccountNumber ) {
		
		eduLoanAccountNumber = ( eduLoanAccountNumber.length() < 16 ? "0" : eduLoanAccountNumber); 
		educationLoanId = (educationLoanId.contains("EL-") ? educationLoanId : null);	
		
		if(eduLoanAccountNumber.length() < 16){
			eduLoanAccountNumber = "0";
		}
		
		if(educationLoanId.startsWith("EL-")){
			educationLoanId = educationLoanId;			
		}
		else{
			educationLoanId = null;
		}
		long eduLoanNumber = Long.parseLong(eduLoanAccountNumber);
		
		List<EducationLoanDetails> details = new ArrayList<EducationLoanDetails>();
		details  = applicationService.fetch(educationLoanId,eduLoanNumber);
		
		return details;
		
	}
	
}
*/