package com.customer.registration.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AboutUsController {

		@RequestMapping("/getInfo")
		public ModelAndView getInfo() {
			ModelAndView model = new ModelAndView("getInfo");
			return model;
	}
}
