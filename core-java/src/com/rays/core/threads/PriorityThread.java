package com.rays.core.threads;

public class PriorityThread extends Thread {
	String name = null;

	public PriorityThread(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + " " + i);
		}
	}

}
