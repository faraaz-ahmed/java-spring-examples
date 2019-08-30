package com.demo.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERLOGS")
public class CustomerLogs {
	@Id
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "SOFTWARE")
	private String software;
	
	@Column(name = "OPERATINGSYSTEM")
	private String operatingSystem;
	
	@Column(name = "PROBLEMDESCRIPTION")
	private String problemDescription;

	public CustomerLogs() {
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public CustomerLogs(String email, String software, String operatingSystem, String problemDescription) {
		super();
		this.email = email;
		this.software = software;
		this.operatingSystem = operatingSystem;
		this.problemDescription = problemDescription;
	}
	
	
	

}
