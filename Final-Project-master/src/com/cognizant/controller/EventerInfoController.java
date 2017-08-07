package com.cognizant.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;
import com.cognizant.service.EventerInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EventerInfoController {

	@Autowired
	private EventerInfoService eventerInfoService;
	
/*	@RequestMapping("/scheduleEvent")
	ModelAndView scheduleEvent(Model model){
		
		ModelAndView mav = new ModelAndView("EventInfoForm");
		return mav;
	}*/

	@RequestMapping(value = "/saveEventDetail", method = RequestMethod.POST)
	public
	String saveEventDetail(@RequestParam(value = "eventName") String eventName,
			@RequestParam(value = "eventLocation") String location, @RequestParam(value = "eventType") String eventType,
			@RequestParam(value = "eventDate") String eventDate, @RequestParam(value = "price") String price)
			throws ParseException, JsonProcessingException {

		EventInfo eventInfo = new EventInfo();
		EventDetail eventDetail = new EventDetail();
		
		setEventInfoDetails(eventInfo, eventName, location);
		setEventDetails(eventDetail, eventType, eventDate, price);
		ObjectMapper mapper = new ObjectMapper();

		Long status = eventerInfoService.saveEventDetail(eventInfo, eventDetail);
		String response = "Successful";
		String json=mapper.writeValueAsString("Unsuccessful");
		if (0 != status) {
			
			
			json = mapper.writeValueAsString(response);
		}
		return json;
	}

	private void setEventDetails(EventDetail eventDetail, String eventType, String date, String price)
			throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date eventDate = format.parse(date);
		eventDetail.setEventDate(eventDate);
		eventDetail.setEventType(eventType);
		eventDetail.setPrice(Double.parseDouble(price));

	}

	private void setEventInfoDetails(EventInfo eventInfo, String eventName, String location) {

		eventInfo.setEventName(eventName);
		eventInfo.setLocation(location);

	}

}
