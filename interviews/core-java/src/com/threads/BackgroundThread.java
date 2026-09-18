package com.threads;

public class BackgroundThread extends Thread {

	String name = null;

	public BackgroundThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
