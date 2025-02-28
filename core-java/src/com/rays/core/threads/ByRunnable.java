package com.rays.core.threads;

public class ByRunnable implements Runnable{
	String name = null;

	public ByRunnable(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

 

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " " + name);
					}
		
	}
}
