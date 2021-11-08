package com.company.entity;

public class Account {

	private AccountType accountType;

	private String accountName;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}

enum AccountType {
	REGULAR,
	OUTSOURCE
}
