package com.threads;

public class Racing extends Thread {
	String name;

	public Racing(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public static Account account = new Account();

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			account.deposit(name, 1000);
			
		}

	}
}
