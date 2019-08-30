package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpApp {
	
	@Autowired
	private EmpDao empDao;
	public void registerEmp() {
		empDao.save();
	}
}
