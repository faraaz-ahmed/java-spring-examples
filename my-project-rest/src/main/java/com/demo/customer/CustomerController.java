package com.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import com.demo.customer.entity.Customer;
import com.demo.customer.entity.CustomerLogs;

@RestController
public class CustomerController {
	@Autowired
	CustomerLogsRepository logsrepo;
	
	@Autowired
	CustomerRepository repo;
	
	@Autowired
	CustomerValidator validator;
	
	@Autowired
	CustomerLogsValidator logsvalidator;
	
	@GetMapping(path = "/customer")
	public String getMainPage(Model model) {
		CustomerLogs c = new CustomerLogs();
		Customer c_ = new Customer();
		model.addAttribute("CustomerLogs", c);
		model.addAttribute("Customer", c_);
		return "customer";
	}
	
	@PostMapping(path = "/customercheck")
	public ModelAndView processForm(@ModelAttribute("CustomerLogs") CustomerLogs c, BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		System.out.println("i got activated!");
		Customer probe = new Customer();
		probe.setEmail(c.getEmail());
		Example<Customer> example = Example.of(probe, ExampleMatcher.matchingAny());
		boolean exists = repo.exists(example);
		logsvalidator.validate(c, errors);
		if(errors.hasErrors()) {
			mv.setViewName("customer");
			return mv;
		} else {
			if(exists == false) {
				System.out.println("email not found");
				mv.setViewName("customerRegister");
				mv.addObject(new Customer(c.getEmail(),""));
	//			getMainPage();
			}else {
				System.out.println("email found bro");
				logsrepo.save(c);
				mv.setViewName("final");
				mv.addObject("email", c.getEmail());
				mv.addObject("problemDescription", c.getProblemDescription());
	
	//			getMainPage();
			}
		}
		return mv;
	}
	
	@PostMapping(path = "/addnewcustomer",)
	public ModelAndView saveCustomer(@ModelAttribute("customer") Customer c, Model model, BindingResult errors) {
		validator.validate(c, errors);
		ModelAndView mv = new ModelAndView();
		if(errors.hasErrors()) {
			mv.setViewName("customerRegister");
		}
		else {
			repo.save(c);
			mv.setViewName("customer");
			model.addAttribute("CustomerLogs", new CustomerLogs());
		}
		return mv;
	}
	
	@PostMapping(path = "/final")
	public ModelAndView displayConfirmationPage(@ModelAttribute("CustomerLogs") CustomerLogs c) {
//		return "final";
		ModelAndView mv = new ModelAndView();
		mv.addObject("email", c.getEmail());
		mv.addObject("problemDescription", c.getProblemDescription());
		return mv;
	}
	
	@PostMapping(path = "/update")
	public String loadUpdatePage(Model model) {
		model.addAttribute("customer", new Customer());
		return "updateCustomer";
	}
	
	@PostMapping(path = "/updatecustomer")
	public ModelAndView updateEmail(@ModelAttribute("customer") Customer c) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updated");
		repo.save(c);
		return mv;
	}
	
	@RequestMapping(path = "/delete")
	public String loadDeletePage(Model model) {
		model.addAttribute("customer", new Customer());
		return "deleteCustomer";
	}
	
	@RequestMapping(path = "/deletecustomer", method = RequestMethod.POST)
	public ModelAndView deletedEmail(@ModelAttribute("customer") Customer c) {
		repo.deleteCustomersByEmail(c.getEmail());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleted");
		return mv;
	}
	
//	@RequestMapping(path = "/customer", method = RequestMethod.POST)
//	public void checkAndReturnResponse(@ModelAttribute("request") Customer c) {
//		
//	}
}
