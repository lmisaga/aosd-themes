package com.aosddemo.entity;

//not used yet, but might use it in full project as an example
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
