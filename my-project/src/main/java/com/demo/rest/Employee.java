package com.demo.rest;

import java.util.Date;

public class Employee {
//	private static final long serialVersionUID = -778861917779;
	
	private int id;
	private String name;
	private Date createdDate;
	public Employee(int id, String name, Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.createdDate = createdDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
