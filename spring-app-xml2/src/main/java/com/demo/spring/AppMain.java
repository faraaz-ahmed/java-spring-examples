package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(""));
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Mail mail = (Mail)ctx.getBean("mymail");
		System.out.println(mail.getMessage().getBody());
		
		mail.getMessage().setBody("We will take no break today");
		
		mail.getMessage().setBody("mm2");
		System.out.println(mail.getMessage().getBody());
		
	}

}
