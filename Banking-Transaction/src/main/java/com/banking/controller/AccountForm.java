package com.banking.controller;

public class AccountForm {
	
	private int accountNumber;
	private String name;
	private int age;
	private String accountType;
	
	public AccountForm() {
		// TODO Auto-generated constructor stub
		super();
	}

	public AccountForm(int accountNumber, String name, int age, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.age = age;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

}
