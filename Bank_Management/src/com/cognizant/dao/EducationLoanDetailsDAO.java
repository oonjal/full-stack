package com.cognizant.dao;

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

import com.cognizant.entity.EducationLoanDetails;
import com.cognizant.entity.UserDetails;

@Repository
@Transactional
public class EducationLoanDetailsDAO{

	//private static final Log log = LogFactory.getLog(EducationLoanDetailsDAO.class);
	private static Logger logger = Logger.getLogger(EducationLoanDetailsDAO.class);

	@Autowired
	SessionFactory sessionFactory;


	/**
	 * @param transientInstance
	 * @return
	 * save the user details into the database
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly = false)
	public String persist(EducationLoanDetails transientInstance) {


		String display;
		Session session = sessionFactory.getCurrentSession();
		logger.debug(transientInstance);

		String IdCard = Long.toString(transientInstance.getIdCardNumber());		
		String educationLoanID = ("EL-").concat(IdCard.substring(IdCard.length() - 5));
		transientInstance.setEducationLoanId(educationLoanID);

		UserDetails userDetails = (UserDetails) session.get(UserDetails.class, transientInstance.getUserDetails().getAccountNumber());
		if (userDetails != null)
		{
			transientInstance.setUserDetails(userDetails);	
			session.saveOrUpdate(transientInstance);

			logger.info("Education loan details: " + transientInstance);

			display ="Successfully created Loan ID : " + educationLoanID + ";Successfully created Loan Acc Num  : " 
					+ transientInstance.getEduLoanAccountNumber();

			logger.info(display);
			return display;
		}
		else
		{
			display = "Invalid Account Number ;Please try again";
			logger.info(display);
			return display;
		}

	}



	public List<EducationLoanDetails> fetch(EducationLoanDetails fetchloanDetails)
	{
		
		//EducationLoanDetails educationLoanDetails = new EducationLoanDetails(); 
		
		Session session = sessionFactory.getCurrentSession();
		List<EducationLoanDetails> list = new ArrayList<EducationLoanDetails>();
		Query query = session.createQuery("from EducationLoanDetails where idCardNumber = :variable");
		query.setParameter("variable", fetchloanDetails.getIdCardNumber());

		list = query.list();		

		return list;
	}
}
