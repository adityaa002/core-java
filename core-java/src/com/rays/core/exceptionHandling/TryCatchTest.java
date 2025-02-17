package com.rays.core.exceptionHandling;

public class TryCatchTest {

	public static void main(String[] args) {
		try {

			System.out.println("before");
			int a = 10;
			int b = 0;
			int c = a / b;


		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("after");

	}

}
