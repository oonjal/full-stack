package com.cognizant.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.cognizant.vo.EventInfoVO;

@Component
public class SpringValidator implements Validator {

	@Override
	public boolean supports(Class<?> paramClass) {
		// TODO Auto-generated method stub
		return EventInfoVO.class.equals(paramClass);
	}

	@Override
	public void validate(Object eventInfoVOObject, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eventDate", "eventDate.required");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Date beginDate = new Date();
		
		EventInfoVO eventInfoVO = (EventInfoVO) eventInfoVOObject;
		
		try {
			beginDate = sdf.parse(eventInfoVO.getEventDate());
			if(!beginDate.after(new Date())) {
				errors.rejectValue("eventDate", "Invalid.Date");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(beginDate);
		cal.add(Calendar.DATE, 90);
		Date dateLimit = cal.getTime();
		if(beginDate.after(dateLimit)){
			errors.rejectValue("eventDate", "Limit.Date");
		}
		
	}

}
