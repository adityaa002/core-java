package com.rays.core.threads;

public class WithThread extends Thread {

	String name = null;

	public WithThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {

			System.out.println(i + " " + name);
		}
	}

}
