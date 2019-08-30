package com.demo.customer;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyBCrypt {
	public static void main(String args[]) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("welcoem1"));
	}
}
