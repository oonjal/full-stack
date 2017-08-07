package com.cognizant.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;

@Repository
public class EventerInfoDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Long saveEventDetail(EventInfo eventInfo, EventDetail eventDetail) {

		Session session = sessionFactory.getCurrentSession();
		Long status = (long) 0;

		Query query = session.createQuery("from EventInfo where eventName =:eventName and location =:location");

		query.setParameter("eventName", eventInfo.getEventName());
		query.setParameter("location", eventInfo.getLocation());

		EventInfo eventInfoAlreadyExist = (EventInfo) query.uniqueResult();

		if (null != eventInfoAlreadyExist) {

			Query query2 = session.createQuery(
					"from EventDetail where eventInfo.eventId =:eventId and eventDate =:eventDate and eventType =:eventType");
			query2.setParameter("eventId", eventInfoAlreadyExist.getEventId());
			query2.setParameter("eventDate", eventDetail.getEventDate());
			query2.setParameter("eventType", eventDetail.getEventType());

			Object eventDetailsAlreadyExist = (Object) query.uniqueResult();

			if (null == eventDetailsAlreadyExist) {
				eventDetail.setEventInfo(eventInfoAlreadyExist);
				status = (Long) session.save(eventDetail);

			} else {
				status = eventInfoAlreadyExist.getEventId();
			}

		} else {

			eventDetail.setEventInfo(eventInfo);
			session.save(eventDetail.getEventInfo());
			status = (Long) session.save(eventDetail);
		}

		return status;
	}

}
