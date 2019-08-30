package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "ACCOUNTS")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCNO")
	private int accountNumber;
	
	@Column(name = "BALANCE")
	private String balance;
	
	
	@ManyToOne
	@JoinColumn(name="CUSTOMERID")
	private Customer customer;
	
	public Account() {
		
	}
	
	

	public Account(int accountNumber, String balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	} 
	
//	@Column(name = "SALARY")
//	private double sal;
//	
//	@ManyToOne
//	@JoinColumn(name ="DNO")
//	private Dept dept;
	
	
	
	
	
}
