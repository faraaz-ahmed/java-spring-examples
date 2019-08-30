package com.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//import com.demo.customer.entity.Customer;
//import com.demo.customer.entity.Emp;
import com.demo.customer.entity.CustomerLogs;

@Component
public class CustomerLogsValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(CustomerLogs.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		CustomerLogs c=(CustomerLogs)target;
		if(c.getEmail().isEmpty()) {
			errors.rejectValue("email", "invalidId", "Id is not Valid");
		}if(c.getSoftware().isEmpty()) {
			errors.rejectValue("software", "nameEmpty", "Name cannot be empty");
		}if(c.getOperatingSystem().isEmpty()) {
			errors.rejectValue("operatingSystem", "invalidName", "Operatins System cannot be empty");
		}if(c.getProblemDescription().isEmpty()) {
			errors.rejectValue("problemDescription", "invalidName", "problem description cannot be empty!");
		}
	}
}
