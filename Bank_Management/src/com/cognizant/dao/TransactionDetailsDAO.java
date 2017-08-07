package com.cognizant.dao;
// Generated Jun 27, 2017 3:26:23 PM by Hibernate Tools 5.2.3.Final

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.UserDetails;

@Repository
public class TransactionDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRED)
	public Long persist(TransactionDetails transientInstance, long transactionAmount) {
		System.out.println(transientInstance.getTransactionId());
		Session session = sessionFactory.getCurrentSession();
		Long sessionID = (long) 0;
		UserDetails userdetails = (UserDetails) session.get(UserDetails.class,
				transientInstance.getUserDetails().getAccountNumber());
		if (null != userdetails) {

			if (transientInstance.getTransactionType().equalsIgnoreCase("Deposit")) {
				long accountBalance = (long) (userdetails.getAccountBalance() + transactionAmount);
				transientInstance.setAccountBalance(accountBalance);
			} else {
				long accountBalance = (long) (userdetails.getAccountBalance() - transactionAmount);
				transientInstance.setAccountBalance(accountBalance);
			}
			transientInstance.setUserDetails(userdetails);
			sessionID = (Long) session.save(transientInstance);

		}

		return sessionID;
	}

	@SuppressWarnings("unchecked")
	public List<TransactionDetails> view() {

		Session session = sessionFactory.getCurrentSession();
		List<TransactionDetails> list = session.createQuery("from TransactionDetails").list();
		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "null" })
	@Transactional(propagation = Propagation.REQUIRED)
	public List<TransactionDetails> viewTransactionWithAccountNumber(long accountNumber, long transactionId) {
		UserDetails userdetails = new UserDetails();
		userdetails.setAccountNumber(accountNumber);
		String sql = "select * from TRANSACTION_DETAILS where ACCOUNT_NUMBER = ? and TRANSACTION_ID = ?";
		TransactionDetails transactionDetails = (TransactionDetails) jdbcTemplate.queryForObject(sql,
				new Object[] { accountNumber, transactionId }, new BeanPropertyRowMapper(TransactionDetails.class));
		transactionDetails.setUserDetails(userdetails);
		List<TransactionDetails> list = new ArrayList<TransactionDetails>();
		list.add(transactionDetails);
		return list;

	}

	@SuppressWarnings("null")
	@Transactional(propagation = Propagation.REQUIRED)
	public List<TransactionDetails> viewTransactionWithTransactionId(long transactionId) {

		String query = "select ACCOUNT_NUMBER from TRANSACTION_DETAILS where TRANSACTION_ID = ?";
		
		Long accountNumber = jdbcTemplate.queryForObject(query, new Object[] {transactionId}, Long.class);
				
		UserDetails userdetails = new UserDetails();
		userdetails.setAccountNumber(accountNumber);

		String sql = "select * from TRANSACTION_DETAILS where TRANSACTION_ID = ?";
		@SuppressWarnings({ "rawtypes", "unchecked" })
		TransactionDetails transactionDetails = (TransactionDetails) jdbcTemplate.queryForObject(sql,
				new Object[] { transactionId }, new BeanPropertyRowMapper(TransactionDetails.class));
		transactionDetails.setUserDetails(userdetails);
		List<TransactionDetails> list = new ArrayList<TransactionDetails>();
		list.add(transactionDetails);
		return list;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public List<TransactionDetails> viewTransactionWithAccountNumber(long accountNumber) {

		/*String sql = "select t.TRANSACTION_ID, t.TRANSACTION_DESCRIPTION, t.TRANSACTION_TYPE, t.ACCOUNT_BALANCE, u.ACCOUNT_NUMBER "
				+ "from TRANSACTION_DETAILS t LEFT JOIN USER_DETAILS u ON t.ACCOUNT_NUMBER = u.ACCOUNT_NUMBER and t.ACCOUNT_NUMBER = ?";
*/
		String sql = "select * from TRANSACTION_DETAILS where ACCOUNT_NUMBER = ?";
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, new Object[] {accountNumber});
		List<TransactionDetails> list = new ArrayList<TransactionDetails>();

		for (Map<String, Object> row : rows) {

			TransactionDetails transactionDetails = new TransactionDetails();
			UserDetails userDetails = new UserDetails();

			transactionDetails.setAccountBalance((Long) row.get("ACCOUNT_BALANCE"));
			transactionDetails.setTransactionDescription((String) row.get("TRANSACTION_DESCRIPTION"));
			transactionDetails.setTransactionId((Long) row.get("TRANSACTION_ID"));
			transactionDetails.setTransactionType((String) row.get("TRANSACTION_TYPE"));
			userDetails.setAccountNumber((Long) row.get("ACCOUNT_NUMBER"));
			transactionDetails.setUserDetails(userDetails);
			list.add(transactionDetails);
		}

		return list;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public long getTransactionId() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(
				"from TransactionDetails where transactionId = (select max(transactionId) from TransactionDetails) ");

		TransactionDetails object = (TransactionDetails) query.uniqueResult();
		if (null != object) {
			long transactionId = object.getTransactionId();
			return transactionId;
		} else
			return 0;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public UserDetails checkAccountNumber(long accountNumber) {

		Session session = sessionFactory.getCurrentSession();
		UserDetails userdetails = (UserDetails) session.get(UserDetails.class, accountNumber);
		return userdetails;
	}
}