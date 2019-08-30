package com.demo.spring;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Calculator {
	
	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("Web Service Started!");
		Endpoint.publish("http://localhost:8282/service/cal", new Calculator());
	}
}