package com.demo.spring;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basepackage = "com.demo.spring")
public class AppMain {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Performer p = (Performer) ctx.getBean("singer");
		System.out.println(p.getClass().getName());
		Method[] methods = p.getClass().getMethods();
		
		// code to display all the methods created by the @EnableAspectjAutoProxy
//		for (Method m : methods) {
//			System.out.println(m.getName());
//		}
//		System.out.println(methods);
		p.perform();
	}
}
