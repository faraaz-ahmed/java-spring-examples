package com.demo.customer;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(int id) {
		super("Employee not found exception");
	}
	
}
