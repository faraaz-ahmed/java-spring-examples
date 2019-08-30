package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M")
public class M {
	
	@Id
	@Column(name = "age")
	private int age;
	
	@Column(name = "name")
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public M(int age, String name) {
//		super();
		this.age = age;
		this.name = name;
	}

	
}
