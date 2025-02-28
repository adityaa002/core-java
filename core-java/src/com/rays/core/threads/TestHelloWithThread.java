package com.rays.core.threads;

public class TestHelloWithThread {
	public static void main(String[] args) {
		HelloWithThread h1 = new HelloWithThread("Aditya");
		HelloWithThread h2 = new HelloWithThread("Sharma");

		h1.start();
		h2.start(); 
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " Im mainn thread");

		}

	}
}
