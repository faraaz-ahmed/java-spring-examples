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
@Order(value = 1)
public class MyLoggerAdvice{
	
	@Pointcut("execution(* com.demo.spring.Perf*.perform(..))")
	public void pcut() {
		
	}
	
	@Before("pcut()")
	public void LogBefore() {
		System.out.println("Before calling perform");
	}
	
	@AfterReturning("pcut()")
	public void logAfter() {
		System.out.println("After calling perform");
	}

}
