package com.rays.core.threads;

public class BackgroundThread extends Thread {
	String name = null;

	public BackgroundThread(String name) {

		this.name = name;
		// TODO Auto-generated constructor stub

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
