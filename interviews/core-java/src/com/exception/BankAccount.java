package com.exception;

public class BankAccount {

	double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Fund deposit success, Current balance : " + balance);
	}

	public double withdraw(double amount) throws BankException {
		if (balance > amount) {
			balance -= amount;
			System.out.println(amount + "  Money debited,Current Balance : " + balance);
		} else {
			BankException e = new BankException("Insufficient balance: " + balance);
			throw e;
		}
		return balance;
	}
}
