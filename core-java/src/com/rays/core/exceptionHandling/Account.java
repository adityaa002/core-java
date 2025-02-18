package com.rays.core.exceptionHandling;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

// Deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
		System.out.println("New Balance: " + balance);
	}

// Withdraw method
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("Remaining Balance: " + balance);
		} else if (amount > balance) {
			InsufficientFundsException e = new InsufficientFundsException(
					"Insufficient funds. Available balance: " + balance);
 				throw e;
			 
		}
	}
}
