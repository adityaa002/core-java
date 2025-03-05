package com.rays.core.practice;

public class TryFinally {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int c = a / b;

		} finally {
			System.out.println("finally is executed");
			// TODO: handle finally clause
		}

		/*
		 * try { int c = a / b;
		 * 
		 * } catch (Exception e) { System.out.println(e.getMessage()); // TODO: handle
		 * exception } System.out.println("Caught Exception");
		 */

	}

}
