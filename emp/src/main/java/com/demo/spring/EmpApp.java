package com.demo.spring;

public class EmpApp {
	private EmpDao empDao;
	
	public void registerEmp() {
		empDao.save();
	}
}
