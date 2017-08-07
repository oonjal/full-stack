/**
 * 
 */
package com.cognizant.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EventDetail;
import com.cognizant.exception.ApplicationException;
import com.cognizant.vo.EventInfoVO;

/**
 * @author training
 *
 */
@Repository
public class WeeklyEventDaoImpl {

	@Autowired
	private SessionFactory sessionfactory;

	@Transactional
	public List<EventDetail> getWeeklyEventData(Date beginDate) throws ApplicationException {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(beginDate);
		calendar.add(Calendar.DATE, 6);
		Date endDate = calendar.getTime();

		Session session = sessionfactory.getCurrentSession();
		/*Query query = session.createQuery("select info.eventName, info.location, detail.eventType, detail.eventDate, "
				+ "detail.price from EventDetail detail INNER JOIN detail.eventInfo info where"
				+ " detail.eventDate >= :beginDate " + "and detail.eventDate <= :endDate");*/
		Query query = session.createQuery("from EventDetail where"
				+ " eventDate >= :beginDate " + "and eventDate <= :endDate");

		query.setParameter("beginDate", beginDate);
		query.setParameter("endDate", endDate);

		@SuppressWarnings("unchecked")
		List<EventDetail> list = (List<EventDetail>) query.list();
		/*List<EventInfoVO> eventInfoVOList = new ArrayList<>();

		@SuppressWarnings("rawtypes")
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {

			Object[] obj = (Object[]) iterator.next();
			EventInfoVO eventInfoVO = new EventInfoVO();
			eventInfoVO.setEventDetailsList(eventDetailsList);
			eventInfoVO.setEventDate((Date) obj[3]);
			eventInfoVO.setEventName((String) obj[0]);
			eventInfoVO.setEventType((String) obj[2]);
			eventInfoVO.setLocation((String) obj[1]);
			eventInfoVO.setPrice((double) obj[4]);
			eventInfoVOList.add(eventInfoVO);
		}
*/
		return list;
	}

}
