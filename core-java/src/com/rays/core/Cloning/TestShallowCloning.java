package com.rays.core.Cloning;

public class TestShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account a1 = new Account(1000, "XYZ");

		Account a2 = (Account) a1.clone();

		a2.balance = 2000;
		a2.name = "ABC";

		System.out.println(a1.name);
		System.out.println(a1.balance);

		System.out.println(a2.name);
		System.out.println(a2.balance);

	}
}