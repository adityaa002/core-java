package com.rays.core.threads;

public class Account {
	private int balance = 0;

	public void setBalance(int balance) {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;

	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;

	}

	public void deposit(String name, int amt) {
		synchronized (this) {
			int total = balance + amt;
			setBalance(total);
		}
			System.out.println(name + " " + getBalance());
	}
}
