package com.cognizant.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

import com.cognizant.dao.TransactionDetailsDAO;
import com.cognizant.entity.TransactionDetails;

public class TransactionFormValidator implements Validator {

	@Autowired
	TransactionDetailsDAO transactionDetailsDAO;
	
	@Override
	public boolean supports(Class<?> paramClass) {
		// which objects can be validated by this validator
		return TransactionDetails.class.equals(paramClass);
	}

	@Override
	public void validate(Object arg0, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "transactionId", "transactionId.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "transactionDescription", "transactionDescription.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "transactionAmount", "transactionAmount.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "transactionType", "transactionType.required");
		// ValidationUtils.rejectIfEmptyOrWhitespace(errors,
		// "userDetails.accountNumber", "accountNumber.required");

		
		TransactionDetails transactionDetails = (TransactionDetails) arg0;
		
		
		Object accountDetails = transactionDetailsDAO.checkAccountNumber(transactionDetails.getUserDetails().getAccountNumber());
		
		if(accountDetails == null){
			errors.rejectValue("userDetails.accountNumber", "unknownAccountNumber", new Object[] { transactionDetails.getUserDetails().getAccountNumber() },
		"Account Number is not available, please enter a valid Account Number");
		}
		
		if (transactionDetails.getUserDetails().getAccountNumber() <= 0) {
			errors.rejectValue("userDetails.accountNumber", "negativeValue", new Object[] { transactionDetails.getUserDetails().getAccountNumber() },
					"accountNumber can't be negative");

		}
		Long i = transactionDetails.getUserDetails().getAccountNumber();
		if (i.toString().length() <16 || i.toString().length() >16 ) {
			errors.rejectValue("userDetails.accountNumber", "16digitsAccountNumber", new Object[] { transactionDetails.getUserDetails().getAccountNumber() },
					"accountNumber should be of 16 characters");

		}

	}

}
