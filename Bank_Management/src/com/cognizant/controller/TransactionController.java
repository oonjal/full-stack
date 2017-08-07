package com.cognizant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.dto.TransactionDto;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.service.TransactionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;
import javax.ws.rs.*;

@Controller
public class TransactionController {

	private static final Logger LOGGER = Logger.getLogger(TransactionController.class);

	@Autowired
	private TransactionService applicationService;

	@Autowired
	@Qualifier("transactionFormValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@ModelAttribute("transaction")
	public TransactionDetails createEmployeeModel() {

		return new TransactionDetails();
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView saveDetails(@Validated @ModelAttribute("command") TransactionDetails transaction,
			BindingResult result, ModelMap model) {

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Debug : save Transaction Details");
		}

		if (result.hasErrors()) {

			LOGGER.error("Validation Errors Occured : " + result.getErrorCount());

			model.addAttribute("transactionId", transaction.getTransactionId());
			return new ModelAndView("View", "model", model);
		}

		Long sessionID = applicationService.addTransaction(transaction, transaction.getTransactionAmount());

		if (sessionID != null) {

			model.addAttribute("sessionID", sessionID);
		}
		return new ModelAndView("Transaction_Success_Page", "model", model);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listTransactions(Model model) {

		return "list";

	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewDetails(@RequestParam("userDetails.accountNumber") long accountNumber,
			@RequestParam("transactionId") long transactionId, Model model) {

		List<TransactionDetails> transactionDetails = new ArrayList<TransactionDetails>();

		if (accountNumber != 0 && transactionId != 0) {
			transactionDetails = applicationService.viewTransactionWithAccountNumber(accountNumber, transactionId);
		} else if (accountNumber == 0) {
			transactionDetails = applicationService.viewTransactionWithTransactionId(transactionId);
		} else {
			transactionDetails = applicationService.viewTransactionWithoutTransactionId(accountNumber);
		}

		model.addAttribute("transactionDetails",transactionDetails);
		return new ModelAndView("list","model",model);

	}
	/*@RequestMapping(value = "/load")
	public ModelAndView loadPage(@ModelAttribute("command") TransactionDetails transaction, BindingResult result,
			ModelMap model) {

		LOGGER.info("Inside loadPage : Getting Transaction ID");

		long currentNumber = applicationService.getTransactionId();
		if (0 == currentNumber) {
			currentNumber = 9999;
		}
		currentNumber = currentNumber + 1;
		model.addAttribute("transactionId", currentNumber);
		return new ModelAndView("View", "model", model);

	}

	@RequestMapping(method = RequestMethod.GET)
	public String loadPage(Locale locale, Model model) {
		// logger.info("Returning custSave.jsp page");
		System.out.println(locale);
		return "View";
	}*/


}
