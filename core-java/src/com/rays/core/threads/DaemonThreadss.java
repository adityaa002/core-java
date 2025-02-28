package com.rays.core.threads;

public class DaemonThreadss extends Thread {

	@Override
	public void run() {
		System.out.println("Demon Thread Started" + Thread.currentThread());
		while (true) {
			
			System.out.println("Daemon Thread !! Woke Up Again");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		DaemonThreadss d1 = new DaemonThreadss();
		d1.setDaemon(true);
		d1.start();
		
		try {
			d1.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
		System.out.println("Leaving main method");
		System.out.println("Now jvm will exit");
	}

}
