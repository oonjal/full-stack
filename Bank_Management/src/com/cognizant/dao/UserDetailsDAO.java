/*package com.cognizant.dao;
// Generated Jun 27, 2017 3:26:23 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.UserDetails;

*//**
 * Home object for domain model class UserDetails.
 * @see com.cognizant.entity.UserDetails
 * @author Hibernate Tools
 *//*
@Repository
public class UserDetailsDAO {

	private static final Log log = LogFactory.getLog(UserDetailsDAO.class);

	
	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserDetails transientInstance) {
		log.debug("persisting UserDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserDetails persistentInstance) {
		log.debug("removing UserDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserDetails merge(UserDetails detachedInstance) {
		log.debug("merging UserDetails instance");
		try {
			UserDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserDetails findById(long id) {
		log.debug("getting UserDetails instance with id: " + id);
		try {
			UserDetails instance = entityManager.find(UserDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
*/