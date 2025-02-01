package com.rays.basics.practice;

public class Account {

	private String accountNumber;
	private String accountType;
	private double balance;
	private double currentBalance;
	private double transferredAmount;

	public String getNumber() {
		return accountNumber;
	}

	public void setNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType(String accountNumber) {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void deposit(String accountNumber, int d) {
		this.balance = balance + d;
		System.out.println("Deposited amount : " + d);
		System.out.println("Total balance : " + balance);

	}

	public void withdrawal(String accountNumber, int w) {
		// currentBalance = balance;
		System.out.println("withdrawal amount : " + w);
		balance = balance - w;
		System.out.println("current balance : " + balance);

	}

	public void setBalance(String accountNumber, double balance) {
		this.balance = balance;
		System.out.println("Balance for account - " + accountNumber + " is " + balance);
		currentBalance = balance;
	}

	public void getBalance(String accountNumber) {
		this.balance = currentBalance;
		// System.out.println("Balance for account - " + accountNumber + " is " +
		// currentBalance);

	}

	public void fundTransfer(String accountNumber, int ft, String ToaccountNumber) {
		System.out.println("Transferring fund amount : " + ft + " FROM account " + accountNumber);
		this.balance = currentBalance + ft;
		System.out.println("Now your current balance of Account " + ToaccountNumber + " is " + balance);

	}

	public void payBill() {

	}

}
