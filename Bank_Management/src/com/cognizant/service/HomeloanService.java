package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.HomeLoanDetailsDAO;
import com.cognizant.entity.HomeLoanDetails;

@Service
public class HomeloanService  {
	// Add appropriate annotations and code wherever required
	
	@Autowired
	HomeLoanDetailsDAO homeLoanDetailsDAO;
	
	public Long insert(HomeLoanDetails applyloan)
	{
		Long loanAccNum = homeLoanDetailsDAO.persist(applyloan);
		System.out.println("In service " + loanAccNum);
		return loanAccNum;
	}
	
	public List<HomeLoanDetails> fetch(HomeLoanDetails fetchloan)
	{
		return homeLoanDetailsDAO.findById(fetchloan);
	}
	
	
	
}
