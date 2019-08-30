package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "MYEMP")
public class Emp {
	
	@Id
	@Column(name = "EMPNO")
	private int emdId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String city;
	
	@Column(name = "SALARY")
	private double sal;
	
	@ManyToOne
	@JoinColumn(name ="DNO")
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Emp() {
		
	}
	public Emp(int emdId, String name, String city, double sal,Dept dept) {
		super();
		this.emdId = emdId;
		this.name = name;
		this.city = city;
		this.sal = sal;
		this.dept = dept;
	}
	public int getEmdId() {
		return emdId;
	}
	public void setEmdId(int emdId) {
		this.emdId = emdId;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
