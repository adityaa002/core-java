package com.rays.core.threads;

public class WithoutThread {

	String name = null;

	public WithoutThread(String name) {
		this.name = name;
	}

	public void runn() {
for (int i = 0; i <=10; i++) {
	System.out.println(i + " = " + name);
}
	}
}
