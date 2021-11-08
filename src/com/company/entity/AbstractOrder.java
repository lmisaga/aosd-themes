package com.company.entity;

import java.math.BigInteger;

public abstract class AbstractOrder {

	private BigInteger id;

	private Account associatedAccount;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Account getAssociatedAccount() {
		return associatedAccount;
	}

	public void setAssociatedAccount(Account associatedAccount) {
		this.associatedAccount = associatedAccount;
	}
}
