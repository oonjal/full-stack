/*package com.cognizant.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

import com.cognizant.entity.EducationLoanDetails;

public class EducationLoanValidator implements Validator {
	
	//private EducationLoanDetails arg0;

	@Override
	public boolean supports(Class<?> paramClass)
	{
		return EducationLoanDetails.class.equals(paramClass);
	}
	
	@Override
	public void validate(Object arg0, Errors errors)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eduLoanAmount", "Loan amount cannot be null");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eduLoanDuration", "Loan duration cannot be null");

		ValidationUtils.rejectIfEmpty(errors, "eduLoanAmount", "errorCode");
	EducationLoanDetails educationLoanDetails = (EducationLoanDetails) arg0;
	Long accNum = educationLoanDetails.getUserDetails().getAccountNumber();
	
	if(accNum <= 0) {
		errors.rejectValue("UserDetails.accountNumber", "negativeValue", new Object[] { "'accountNumber'" },
				"accountNumber can't be negative");
	}		
	
	
	else if (accNum.toString().length() < 16 || accNum.toString().length() > 16 ) {
		errors.rejectValue("UserDetails.accountNumber", "16digitsAccountNumber", new Object[] { "'accountNumber'" },
				"accountNumber should be of 16 characters");
	}
	
	Long loanAmt = educationLoanDetails.getEduLoanAmount();
	if(loanAmt <= 0) {
		errors.rejectValue("eduLoanAmount", "negative value", 
				new Object[] {"'eduLoanAmount'"}, "account cannot be negative");
	}
	else if (loanAmt.toString().length() > 16) {
		errors.rejectValue("eduLoanAmount", "16digitsLoanAmount", 
				new Object[] {"'eduLoanAmount'"}, "account should be less than 16 digits");
	}
	
	String courseName = educationLoanDetails.getCourseName();
	if(courseName.matches("[0-9]+")) {
		errors.rejectValue("courseName", "StringContainsNumeric", new Object[] {"'courseName'"}, 
				"Course Name contains numbers");
	}
	
	Long courseFee = educationLoanDetails.getCourseFee();
	if(courseFee <= 0) {
		errors.rejectValue("courseFee", "negative value", 
				new Object[] {"'courseFee'"}, "Course Fee cannot be negative");
	}
	else if (courseFee.toString().length() > 16) {
		errors.rejectValue("courseFee", "16digitsCourseFee", 
				new Object[] {"'courseFee'"}, "Course Fee should be less than 16 digits");
	}
	
	String fatherName = educationLoanDetails.getFatherName();
	if(fatherName.matches("[0-9]+")) {
		errors.rejectValue("fatherName", "StringContainsNumeric", new Object[] {"'fatherName'"}, 
				"Father Name contains numbers");
	}
	
	
	Long idNumber = educationLoanDetails.getIdCardNumber();
	if(idNumber <= 0) {
		errors.rejectValue("idCardNumber", "negative value", 
				new Object[] {"'idCardNumber'"}, "ID Card Number cannot be negative");
	}
	else if (idNumber.toString().length() > 16) {
		errors.rejectValue("idCardNumber", "16digitsidCardNumber", 
				new Object[] {"'idCardNumber'"}, "ID Card Number should be less than 16 digits");
	}
	
	
	Long annualIncome = educationLoanDetails.getFatherAnnualIncome();
	if(annualIncome <= 0) {
		errors.rejectValue("fatherAnnualIncome", "negative value", 
				new Object[] {"'fatherAnnualIncome'"}, "Father Annual Income cannot be negative");
	}
	else if (annualIncome.toString().length() > 16) {
		errors.rejectValue("fatherAnnualIncome", "16digitsidCardNumber", 
				new Object[] {"'fatherAnnualIncome'"}, "Father Annual Income should be less than 16 digits");
	}
	
	
}
}
*/