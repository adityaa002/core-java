package com.exception;

public class TestAccount {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		 acc.setBalance(200);
		 acc.deposit(100);

		try {
			System.out.println(acc.withdraw(200));
		} catch (BankException e) {
			System.out.println(e);
		}
		acc.setBalance(200);
		System.out.println(acc.getBalance() + " OK");

	}

}
