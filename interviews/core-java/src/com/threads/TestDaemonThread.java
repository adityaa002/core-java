package com.threads;

public class TestDaemonThread {
	public static void main(String[] args)  {

		BackgroundThread t1 = new BackgroundThread("Daemon Thread ");

		t1.setDaemon(false);
		
		t1.start();

		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread");
		}
	}
}
