package com.cognizant.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EducationLoanDetailsDAO;
import com.cognizant.entity.*;

@Service
public class EducationLoanService  {

	@Autowired
	EducationLoanDetailsDAO educationLoanDetailsDAO;

	private static Logger logger = Logger.getLogger(EducationLoanService.class);

	public String insert(EducationLoanDetails applLoan) {
		String display = educationLoanDetailsDAO.persist(applLoan);

		logger.debug(applLoan);
		return display;
	}


	public List<EducationLoanDetails> fetch(EducationLoanDetails fetchloan) {
		return educationLoanDetailsDAO.fetch(fetchloan);
	}


}
