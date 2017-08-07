package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.TransactionDetailsDAO;
import com.cognizant.entity.TransactionDetails;

@Service("applicationService")

public class TransactionService {

	@Autowired
	TransactionDetailsDAO transactionDetailsDAO;

	public Long addTransaction(TransactionDetails transcation, long transactionAmount) {

		return transactionDetailsDAO.persist(transcation, transactionAmount);
	}

	public List<TransactionDetails> viewTransaction() {
		return transactionDetailsDAO.view();
	}

	public List<TransactionDetails> viewTransactionWithAccountNumber(long accountNumber, long transactionId) {
		return transactionDetailsDAO.viewTransactionWithAccountNumber(accountNumber, transactionId);

	}

	public List<TransactionDetails> viewTransactionWithTransactionId(long transactionId) {
		return transactionDetailsDAO.viewTransactionWithTransactionId(transactionId);

	}
	
	public List<TransactionDetails> viewTransactionWithoutTransactionId(long transactionId) {
		return transactionDetailsDAO.viewTransactionWithAccountNumber(transactionId);

	}

	public long getTransactionId() {
		long transactionId = transactionDetailsDAO.getTransactionId();
		return transactionId;
	}
}
