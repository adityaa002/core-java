package com.threads;

public class Account {

	int balance;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return balance;
	}

	public  void deposit(String name, int amount) {

		int total = balance + amount;
		setBalance(total);
		System.out.println(name + " " + getBalance());

	}
}
