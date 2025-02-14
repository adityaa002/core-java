package com.rays.core.deepCloning;

public class Customer implements Cloneable {

	public String name = null;
	public Account account;

	public Customer(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
 		c.account = (Account) c.account.clone();
		return c;
	}

}
