package com.rays.core.threads;

public class HelloWithThread extends Thread {
	String name = null;

	public HelloWithThread(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		for(int i = 1 ; i <=5 ; i++) {
			System.out.println(i + " # " + name);
		}
	}
	

}
