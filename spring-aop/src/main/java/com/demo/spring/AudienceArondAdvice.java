package com.demo.spring;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;

@Component
@Aspect
public class AudienceArondAdvice {
	
	@Around("execution(* com.demo.spring.Perf*.perform(..))")
	public Object invoke(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("takeseats....");
		System.out.println("get comfortable");
		Object retVal = pjp.proceed();
		System.out.println("Clap Clap Clap");
		return retVal;
	}
}