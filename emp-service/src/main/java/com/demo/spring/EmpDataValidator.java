package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.spring.entity.Emp;

@Component
public class EmpDataValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(Emp.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Emp e = (Emp)target;
		if(e.getEmpId()<100) {
			errors.rejectValue("empId", "invalidId", "Id is not valid!");
		} if(e.getName().isEmpty()) {
			errors.rejectValue("name", "nameEmpty", "Name cannot be empty");
		} if(e.getCity().isEmpty()) {
			errors.rejectValue("city", "invalid city", "City cannot eb Empty");
		} if(e.getSalary()<5000) {
			errors.rejectValue("salary", "invalid salary", "salary cannot be les than 5000");
		}

	}

}
