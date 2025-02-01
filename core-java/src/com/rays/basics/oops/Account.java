package com.rays.basics.oops;

public class Account {

	private String accountNumber;
	private String accountType;
	private double balance;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("INVALID BALANCE");
		}
	}

	public double getBalance() {
		return balance;
	}

	// DEPOSIT AMOUNT METHOD
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("DEPOSITED AMOUNT :" + amount);
			System.out.println("NEW BALANCE : " + balance);
		} else {
			System.out.println("INVALID DEPOSIT AMOUNT");
		}

	}

	// WITHDRAWAL AMOUNT METHOD
	public void withdrawal(double amount) {
		if (amount < balance && amount > 0) {
			balance -= amount;
			System.out.println("WITHDRAWAL AMOUNT : " + amount);
			System.out.println("REMAINING BALANCE : " + balance);
		} else if (amount > balance) {
			System.out.println("INSUFFICIENT FUNDS !  BALANCE " + balance);
		} else {
			System.out.println("INVALID WITHDRAWAL AMOUNT");
		}

	}

	// FUNDTRANSFER AMOUNT METHOD
	public void fundTransfer(Account accountToTransfer, double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			accountToTransfer.balance = accountToTransfer.balance + amount;
			System.out.println("Transferred " + amount + " to " + accountToTransfer.getAccountNumber());
			System.out.println("Your New Balance: " + this.balance);
		} else {
			System.out.println("Transfer failed. Insufficient funds or invalid amount");
		}

	}

	// PAYBILLS AMOUNT METHOD
	public void payBills(String biller, double amount) {
		if (amount < balance && amount > 0) {
			balance -= amount;
			System.out.println("Bill : " + amount + " PAID TO " + biller);
			System.out.println("AVAILABLE BALANCE : " + balance);
		} else {
			System.out.println("Transfer failed. Insufficient funds or invalid amount");
		}

	}

	public void displayAccountInfo(Account account) {
		System.out.println("ACCOUNT DETAILS");
		System.out.println("ACCOUNT NUMBER :" + accountNumber);
		System.out.println("ACCOUNT TYPE : " + accountType);
		System.out.println("AVAILABLE BALANCE :" + balance);
	}
}
