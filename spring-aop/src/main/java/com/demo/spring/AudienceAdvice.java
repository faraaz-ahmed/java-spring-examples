package com.demo.spring;

//import org.apache.logging.log4j.core.config.Order;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(value = 2)
public class AudienceAdvice {
	
	@Pointcut("execution(* com.demo.spring.Perf*.perform(..))")
	public void pcut() {
		
	}
	
	@Before("pcut()")
	public void takeSeat() {
		System.out.println("Audience switched off mobiles");
	}
	
	@Before("pcut()")
	public void switchOffMobile() {
		System.out.println("Audience switches off mobile");
	}
	
	@AfterReturning("pcut()")
	public void applaud() {
		System.out.println("Audience Applauds!");
	}

}
