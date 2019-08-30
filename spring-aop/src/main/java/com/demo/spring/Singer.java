package com.demo.spring;

import org.springframework.stereotype.Service;

@Service
public class Singer implements Performer{
	
	
	public void perform() {
		System.out.println("The Singer is Singing now.");
	}
}
