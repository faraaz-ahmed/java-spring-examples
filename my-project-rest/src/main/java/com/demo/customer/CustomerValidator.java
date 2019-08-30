package com.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.customer.entity.Customer;
//import com.demo.customer.entity.Emp;

@Component
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Customer.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Customer c=(Customer)target;
		if(c.getEmail().isEmpty()) {
			errors.rejectValue("empId", "invalidId", "Id is not Valid");
		}if(c.getName().isEmpty()) {
			errors.rejectValue("name", "nameEmpty", "Name cannot be empty");
		}
	}
}
