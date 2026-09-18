package com.oop.deepCloning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {

		Customer c1 = new Customer("Aditya");
		Customer c2 = (Customer) c1.clone();

		c2.name = "Chetan";
		c2.account.balance = 2000;

		System.out.println(c1.name + " : " + c1.account.balance);
		System.out.println(c2.name + " : " + c2.account.balance);
	}

}
