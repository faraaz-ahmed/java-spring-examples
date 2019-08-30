package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoMockImpl implements EmpDao{
	public void save() {
		System.out.println("Your information has beeen saved!");
	}

}
