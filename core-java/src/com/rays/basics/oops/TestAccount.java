package com.rays.basics.oops;

public class TestAccount {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();

		acc1.setAccountNumber("BOI22008783");
		acc1.setAccountType("Savings");
		acc1.setBalance(10000);

		acc2.setAccountNumber("SBI02188076");
		acc2.setAccountType("Current");
		acc2.setBalance(12500);

		acc3.setAccountNumber("CBI77653901");
		acc3.setAccountType("Savings");
		acc3.setBalance(5000);

		acc1.displayAccountInfo(acc1);
		acc1.deposit(5660);
		acc1.withdrawal(2000);

		acc1.fundTransfer(acc2, 500);

		acc2.getBalance();

		acc1.payBills("Food", 400);
		acc1.payBills("movie", 800);
		acc1.payBills("Wifi", 400);
	}

}
