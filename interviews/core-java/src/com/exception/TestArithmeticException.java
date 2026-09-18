package com.exception;

public class TestArithmeticException {
	public static void main(String[] args) {

		int a = 3;
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
