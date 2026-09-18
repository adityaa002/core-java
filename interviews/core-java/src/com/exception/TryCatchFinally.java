package com.exception;

public class TryCatchFinally {
	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is finally block and it executes everytime !");
			System.exit(0);
		}
	}
}
