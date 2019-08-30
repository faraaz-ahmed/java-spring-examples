package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MYDEPT")
public class Dept {
	
	@Id
	@Column(name = "DNO")
	private int dno;
	
	@Column(name = "DNAME")
	private String dname;
	
	@Column(name = "MANAGER")
	private String name;
	
	@OneToMany
	@JoinColumn(name = "DNO")
	Set<Emp> emps = new HashSet<>();
	
	public Dept() {
		
	}
	
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	public Dept(int dno, String dname, String name) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.name = name;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
}
