/*package com.cognizant.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.HomeLoanDetails;
import com.cognizant.service.HomeloanService;


@Controller
//@RequestMapping("/test")
public class HomeLoanController {

	@Autowired
	private HomeloanService applicationService;

	@RequestMapping("/applyloan")
	public ModelAndView applyhomeloan(HttpServletRequest resquest, HttpServletResponse response) {
		HomeLoanDetails homeLoanDetails = new HomeLoanDetails();
		//homeLoanDetails.setUserDetails(new UserDetails());
		
		return new ModelAndView("applyhomeloan", "homeLoanDetails", homeLoanDetails);
		//return new ModelAndView("applyhomeloan", "message", "");
	}

	@RequestMapping("/homepage")
	public ModelAndView index(HttpServletRequest resquest, HttpServletResponse response) {
		return new ModelAndView("home", "message", "");
	}
	
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.GET)
	public String values(ModelMap model) {
		
		model.addAttribute("homeLoanDetails", new HomeLoanDetails());
		return "applyhomeloan";
	}
	
	// method to bind date type fields from JSP Page
	 @InitBinder
	    public void initBinder(WebDataBinder binder) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	        dateFormat.setLenient(false);
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    }
	
	method to pass form values to Service layer , Fetch Loan Account Number, Bind Errors
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.POST)
	public ModelAndView formvalues(@Valid @ModelAttribute("homeLoanDetails") HomeLoanDetails homeLoanDetails, BindingResult result, ModelMap model) {
		
		if(result.hasErrors())
		{
			return new ModelAndView("applyhomeloan", "message", "homeLoanDetails");
		}
		Long loanAccNum = applicationService.insert(homeLoanDetails);
		return new ModelAndView("Success", "message", loanAccNum);
	}

	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.GET)
	public String values(@ModelAttribute("HomeLoanDetails")HomeLoanDetails homeLoanDetails) {
		
		//model.addAttribute("homeLoanDetails", new HomeLoanDetails());
		return "applyhomeloan";
	}
	
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.POST)
	public String formvalues(@Valid @ModelAttribute("homeLoanDetails") HomeLoanDetails homeLoanDetails, BindingResult result, Model model) {
		
		if(result.hasErrors())
		{
			return "applyhomeloan";
		}
		Long loanAccNum = applicationService.insert(homeLoanDetails);
		model.addAttribute("message", loanAccNum);
		return "Success";
	}
	
	
	/*Method to fetch home loan details
	 @RequestMapping("/fetchdetails")
	public ModelAndView fetchdetails(HttpServletRequest resquest, HttpServletResponse response) {
		return new ModelAndView("FetchhomeloanDetails", "message", "");
	}

	@RequestMapping(value ="/getdetails",method = RequestMethod.GET)
	public ModelAndView getDetailsById(@ModelAttribute("fetchloan") HomeLoanDetails fetchloan, ModelMap model) {
		System.out.println("fetchdetailscontroller");
		List<HomeLoanDetails> details = new ArrayList<HomeLoanDetails>();
		details = applicationService.fetch(fetchloan);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("detailsList", details);
		return new ModelAndView("displayDetails", "model", map);
	} 

}

package com.cognizant.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.HomeLoanDetails;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplicationService;


@Controller
//@RequestMapping("/test")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	@RequestMapping("/applyloan")
	public ModelAndView applyhomeloan() {
		HomeLoanDetails homeLoanDetails = new HomeLoanDetails();
		//homeLoanDetails.setUserDetails(new UserDetails());
		
		return new ModelAndView("applyhomeloan", "homeLoanDetails", homeLoanDetails);
	}

	@RequestMapping("/homepage")
	public ModelAndView index() {
		return new ModelAndView("home", "message", "");
	}
	
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.GET)
	public String values(ModelMap model) {
		
		model.addAttribute("homeLoanDetails", new HomeLoanDetails());
		return "applyhomeloan";
	}
	
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.POST)
	public ModelAndView formvalues(@Valid @ModelAttribute("homeLoanDetails") HomeLoanDetails homeLoanDetails, BindingResult result, ModelMap model) {
		
		if(result.hasErrors())
		{
			return new ModelAndView("applyhomeloan", "message", "");
		}
		Long loanAccNum = applicationService.insert(homeLoanDetails);
		return new ModelAndView("Success", "message", loanAccNum);
	}

	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.GET)
	public String values(@ModelAttribute("HomeLoanDetails")HomeLoanDetails homeLoanDetails) {
		
		//model.addAttribute("homeLoanDetails", new HomeLoanDetails());
		return "applyhomeloan";
	}
	
	@RequestMapping(value ="/FormValuesToController",method = RequestMethod.POST)
	public String formvalues(@Valid @ModelAttribute("homeLoanDetails") HomeLoanDetails homeLoanDetails, BindingResult result, Model model) {
		
		if(result.hasErrors())
		{
			return "applyhomeloan";
		}
		Long loanAccNum = applicationService.insert(homeLoanDetails);
		model.addAttribute("message", loanAccNum);
		return "Success";
	}
	
	
	@RequestMapping("/fetchdetails")
	public ModelAndView fetchdetails(HttpServletRequest resquest, HttpServletResponse response) {
		return new ModelAndView("FetchhomeloanDetails", "message", "");
	}

	@RequestMapping(value ="/getdetails",method = RequestMethod.GET)
	public ModelAndView getDetailsById(@ModelAttribute("homeloan") HomeLoanDetails fetchloan, BindingResult result, ModelMap model) {
		System.out.println("fetchdetailscontroller");
		List<HomeLoanDetails> details = new ArrayList<HomeLoanDetails>();
		details = applicationService.fetch(fetchloan);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("detailsList", details);
		return new ModelAndView("displayDetails", "model", map);
	}

}
*/