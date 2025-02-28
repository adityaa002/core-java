package com.rays.core.threads;

public class Racing extends Thread {
	private String name;
	private static Account account = new Account();

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposite(name, 1000);
		}
	}
}