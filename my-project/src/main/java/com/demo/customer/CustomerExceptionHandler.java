package com.demo.customer;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ModelAndView exception(CustomerNotFoundException ex) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("errors");
		mv.addObject("message", ex.getMessage());
		return mv;
	}
	
	//usage : throw new CustomerNotFoundException
}
