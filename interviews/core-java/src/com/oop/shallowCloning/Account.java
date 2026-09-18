package com.oop.shallowCloning;

public class Account implements Cloneable{
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
