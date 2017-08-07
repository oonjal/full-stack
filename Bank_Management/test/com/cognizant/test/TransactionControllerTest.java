/*package com.cognizant.test;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.cognizant.controller.TransactionController;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.service.TransactionService;

public class TransactionControllerTest {

	@Mock
	private TransactionService applicationServiceMock;
	
	@InjectMocks
	@Autowired
	private TransactionController transactionControllerMock;
	
	public void initialize(){
		MockitoAnnotations.initMocks(this);
	}
	
	public void viewDetails() {
		Model model;
		doReturn(getTransactionDetails()).when(applicationServiceMock).viewDetails(123L,234L,model);
	}

	private Object getTransactionDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
*/