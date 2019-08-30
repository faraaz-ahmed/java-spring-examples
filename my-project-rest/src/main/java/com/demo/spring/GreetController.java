package com.demo.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET)
	public String greet(@PathVariable("name") String userName) {
		return "Hello from spring rest meow :" + userName;
	}
}
