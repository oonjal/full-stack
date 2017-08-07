package com.cognizant.dao;
// Generated Jun 27, 2017 3:26:23 PM by Hibernate Tools 5.2.3.Final


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 

import com.cognizant.entity.HomeLoanDetails;
import com.cognizant.entity.UserDetails;



@Repository
@Transactional
public class HomeLoanDetailsDAO {

	//private static final Log log = LogFactory.getLog(HomeLoanDetailsDAO.class);
	private static Logger logger = Logger.getLogger(HomeLoanDetailsDAO.class);

	@Autowired	
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.REQUIRED, readOnly = false) 
	public Long persist(HomeLoanDetails applyloan) {

/*		String homeLoanId = UUID.randomUUID().toString();
		homeLoanId = homeLoanId.substring(0,3);
		applyloan.setHomeLoanId(homeLoanId);
		
		String homeLoanAccountNumber = UUID.randomUUID().toString();
		homeLoanAccountNumber = homeLoanAccountNumber.substring(0,3);
		applyloan.setHomeLoanAccountNumber(homeLoanAccountNumber);*/
		
		Session session = sessionFactory.getCurrentSession();
		String homeloanAcc = Long.toString(applyloan.getUserDetails().getAccountNumber());
		String homeloanid = "HL-".concat(homeloanAcc.substring(homeloanAcc.length()-5)); 
		applyloan.setHomeLoanId(homeloanid);
		
		UserDetails userDetails = (UserDetails) session.get(UserDetails.class, applyloan.getUserDetails().getAccountNumber());
		 
		if (userDetails != null)
		{
			applyloan.setUserDetails(userDetails);
			//logger.info("Home loan details : " + userDetails);
		}
		session.saveOrUpdate(applyloan);
		Long loanAccNum = applyloan.getHomeLoanAccountNumber();
		System.out.println(loanAccNum);
		return 	loanAccNum;
	}
	
	public List<HomeLoanDetails> findById(HomeLoanDetails fetchloan) {
		
		Session session = sessionFactory.getCurrentSession();
		List<HomeLoanDetails> list = new ArrayList<HomeLoanDetails>();
		Query query = session.createQuery("from HomeLoanDetails where homeLoanAccountNumber = :variable");
		query.setParameter("variable", fetchloan.getHomeLoanAccountNumber());
		list = query.list();
		//Gson gson = new Gson();
		
		return list;
	}

	/*@PersistenceContext
	private EntityManager entityManager;

	public void persist(HomeLoanDetails transientInstance) {
		log.debug("persisting HomeLoanDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(HomeLoanDetails persistentInstance) {
		log.debug("removing HomeLoanDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public HomeLoanDetails merge(HomeLoanDetails detachedInstance) {
		log.debug("merging HomeLoanDetails instance");
		try {
			HomeLoanDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HomeLoanDetails findById(String id) {
		log.debug("getting HomeLoanDetails instance with id: " + id);
		try {
			HomeLoanDetails instance = entityManager.find(HomeLoanDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	 */}
