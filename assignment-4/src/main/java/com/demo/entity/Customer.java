package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

	@Id
	@Column(name = "CUSTOMERID")
	private int customerId;

	@Column(name = "CUSTOMERNAME")
	private String customerName;

//	@Column(name = "CUSTOMER")
//	private String customer;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMERID")
	Set<Account> acc = new HashSet<>();

	public Customer() {

	}

	public Customer(int customerId, String customerName, Set<Account> acc) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.acc = acc;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Account> getAcc() {
		return acc;
	}

	public void setAcc(Set<Account> acc) {
		this.acc = acc;
	}

}
