package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class Emp {
//	@Autowired
	private int empId;
//	@Autowired
	private String name;
//	@Autowired
	private String city;
//	@Autowired
	private double salary;
	public Emp(int empId, String name, String city, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public void registerEmployee() {
		EmpDao e = new EmpApp();
		e.save(this);
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
