package com.rays.core.practice;

public class TestRunnable {
	public static void main(String[] args) {
		ByRunnbale runn = () -> {
			System.out.println("Thread is running   !!");

		};

		Thread t1 = new Thread((Runnable) runn);
		t1.start();
	}

}
