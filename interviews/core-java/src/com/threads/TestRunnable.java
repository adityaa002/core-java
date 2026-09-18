package com.threads;

public class TestRunnable {

	public static void main(String[] args) {
		
		ByRunnable t1 = new ByRunnable("abc");
		ByRunnable t2 = new ByRunnable("xyz");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();;
		tt2.start();;
 		
	}
}
