package com.customer.registration.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class FaqController {

	@RequestMapping("/getFaqs")
	public ModelAndView getFaqs() {
		ModelAndView model = new ModelAndView("getFaqs");
		return model;
	}
}
