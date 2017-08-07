package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EventerInfoDaoImpl;
import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;

@Service
public class EventerInfoService  {

	@Autowired
	private EventerInfoDaoImpl eventerInfoDaoImpl;
	
	public Long saveEventDetail(EventInfo eventInfo, EventDetail eventDetail) {

		return eventerInfoDaoImpl.saveEventDetail(eventInfo,eventDetail);
	}

}
