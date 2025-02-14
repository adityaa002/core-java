package com.rays.core.deepCloning;

public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc = new Account(100);

		Customer c1 = new Customer("abc", acc);

		Customer c2 = (Customer) c1.clone();

		System.out.println(c1.name);
		System.out.println(c1.account.balance);

		c2.name = "xyz";
		c2.account.balance = 200;

		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}
}
