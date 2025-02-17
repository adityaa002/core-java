package com.rays.core.exceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		String s = null;

		try {
			int c = a / b;
			System.out.println("Division : " + c);
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		} catch (Exception e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			System.out.println("Finally Block");
		}

	}
}
