package com.rays.core.threads;

public class DaemonThread {
	public static void main(String[] args) { 
		BackgroundThread t1 = new BackgroundThread("Daemon Thread");
		
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 0; i <=10  ; i++) {
			
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " Main Thread");
		}
		
	}
}
