package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M1")
public class M1 {
	
	@Id
	@Column(name = "age1")
	private int age1;
	
	@Column(name = "name1")
	private String name1;

	public M1(int age1, String name1) {
		super();
		this.age1 = age1;
		this.name1 = name1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	
	}

