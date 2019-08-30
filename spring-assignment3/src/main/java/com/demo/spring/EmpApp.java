package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EmpApp implements EmpDao {
	
	
	public void save(Emp emp) {
		System.out.println("The employee id is as follows : "+emp.getEmpId()+emp.getName()+emp.getSalary()+emp.getCity());
	}
	
	
	
}
