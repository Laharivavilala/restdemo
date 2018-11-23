package com.cg.restdemo.bean;


public class Account {


	private int accountId;
	private double balance;

	private int customerId;
	private String Name;
	private String phoneNum;
	private String emailId;
	private String address;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance
				+ ", customerId=" + customerId + ", Name=" + Name
				+ ", phoneNum=" + phoneNum + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}
	
	
	
	
	
}
