package com.sp.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_table")
public class Account {
	@Id
	@GeneratedValue
	private long id;
	private String accountNumber;
	private String accountName;
	private  int balance;
	public Account() {
		super();
	}
	public Account(String accountNumber, String accountName, int balance) {
		super();
		
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
