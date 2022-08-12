package com.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.AUTO
			)
	private int bid;
	private String managerName;
	private String ifscCode;
	private int aid;
	
	public Bank() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Bank( String managerName, String ifscCode, int aid) {
		super();
		//this.bid = bid;
		this.managerName = managerName;
		this.ifscCode = ifscCode;
		this.aid = aid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}
	
	
}
