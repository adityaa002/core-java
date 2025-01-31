package com.rays.basics.oops;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account();

		acc.setNumber("ABC123");
		acc.setAccountType("Savings");
		acc.setBalance("ABC123", 10000);

		acc.getBalance("ABC123");

		acc.withdrawal("ABC123", 500);
		acc.deposit("ABC123", 2000);
		acc.setBalance("ABC1234", 3000);
	acc.getBalance("ABC1234");
		acc.fundTransfer("ABC123", 5000, "ABC1234");
	
	}
}
