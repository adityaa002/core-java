package com.rays.core.exceptionHandling;

public class TestArithmeticException {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;

		try {
			int c = a / b;
			System.out.println("Division" + c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
