package com.oop.deepCloning;

public class Customer implements Cloneable {

	String name;
	Account account;

	public Customer(String name) {
		this.name = name;
		this.account = new Account(1000);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) c.account.clone();
		return c;
	}
}
