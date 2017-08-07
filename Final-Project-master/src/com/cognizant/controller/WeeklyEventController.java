/**
 * 
 */
package com.cognizant.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.EventDetail;
import com.cognizant.exception.ApplicationException;
import com.cognizant.service.WeeklyEventService;
import com.cognizant.validator.SpringValidator;
import com.cognizant.vo.EventInfoVO;

/**
 * @author training
 *
 */
@Controller
public class WeeklyEventController {

	@Autowired
	private WeeklyEventService weeklyEventService;
	
	@Autowired
	private SpringValidator springValidator;
	
	/*@RequestMapping("/weeklyEvents")
	String scheduleEvent(Model model){
		
		return "WeeklyEventDataList";
	}*/
	
	@RequestMapping(value="/getWeeklyEventData", method=RequestMethod.GET)
	public String getWeeklyEventData(Model model) {
		model.addAttribute("EventInfoVO", new EventInfoVO());
		return "WeeklyEventDataList";
	}
	
	@RequestMapping(value="/getWeeklyEventData", method= RequestMethod.POST)
	public ModelAndView getWeeklyEventData(@ModelAttribute("EventInfoVO") EventInfoVO eventInfoVO, BindingResult bindingResult, Model model) throws ParseException, ApplicationException{
		ValidationUtils.invokeValidator(springValidator, eventInfoVO, bindingResult);
		if (bindingResult.hasErrors()) {

			//LOGGER.error("Validation Errors Occured : " + result.getErrorCount());
 
			
			return new ModelAndView("WeeklyEventDataList", "model", model);
		}
		
		List<EventDetail> eventDetailList = weeklyEventService.getWeeklyEventData(eventInfoVO.getEventDate());
		EventInfoVO eventInfoVOList = new EventInfoVO();
		eventInfoVOList.setEventDetailsList(eventDetailList);
		model.addAttribute("weeklyEventList",eventInfoVOList);
		return new ModelAndView("WeeklyEventDataList","model",model);
	}
}
