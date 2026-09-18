package com.exception;

public class TryWithMultiCatchFinally {

	public static void main(String[] args) {

		int a = 2;
		String s = null;

		try {
			//System.out.println(a / 0);
			System.out.println(s.length());

		} catch (NullPointerException e) {
			e.printStackTrace();

		} catch (ArithmeticException e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally block always executes...!");
		}
	}
}
