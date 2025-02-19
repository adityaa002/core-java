package com.rays.core.exceptionHandling;

public class SpecifiedExpTest {
	public static void main(String[] args) {

		int a = 10;

		int b = 2;

		String name = null;

		try {

			int c = a / b;
			System.out.println("Division = " + c);

			System.out.println(name.length());

		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {

 			System.out.println(e.getMessage());
 
		} catch (Exception e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
}