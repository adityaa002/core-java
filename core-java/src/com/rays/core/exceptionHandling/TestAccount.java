package com.rays.core.exceptionHandling;

public class TestAccount {
	public static void main(String[] args) {

		Account acc = new Account();
		acc.setBalance(1000);
		System.out.println("before");
		try {
			acc.withdraw(2000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
