package com.rays.core.threads;

public class Account {
	private int balance = 0;

	public synchronized int getBalance() { // Synchronized for thread safety
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void setBalance(int balance) { // Synchronized for thread safety
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized void deposite(String name, int amt) {
		int total = getBalance();
		total = total + amt;
		setBalance(total);
		System.out.println(name + " deposited: " + amt + ", Total Balance: " + getBalance());
	}
}
