/**
 * 
 */
package com.cognizant.service;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.WeeklyEventDaoImpl;
import com.cognizant.entity.EventDetail;
import com.cognizant.exception.ApplicationException;
import com.cognizant.vo.EventInfoVO;

/**
 * @author training
 *
 */
@Service
public class WeeklyEventService {

	@Autowired
	private WeeklyEventDaoImpl weeklyEventDaoImpl;
	
	public List<EventDetail> getWeeklyEventData(String date) throws ParseException, ApplicationException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = format.parse(date);
		return weeklyEventDaoImpl.getWeeklyEventData(beginDate);
	}

}
