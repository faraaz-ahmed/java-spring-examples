package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RegisterEmp {
	
	@Pointcut("execution(* com.demo.spring.EmpApp.save(..))")
	public void pcut() {
		
	}

	@Before("pcut()")
	public void before() {
		System.out.println("Before calling function");
	}
	
	@AfterReturning("pcut()")
	public void after() {
		System.out.println("After calling function");
	}
}
