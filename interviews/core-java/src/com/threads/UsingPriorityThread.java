package com.threads;

public class UsingPriorityThread extends Thread {

	String name = null;

	public UsingPriorityThread(String name) {

		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i <=5 ; i++) {
			System.out.println(name + " " + i);
		}
	}

}
