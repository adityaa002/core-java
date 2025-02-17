package com.rays.core.exceptionHandling;

public class TestNullPointer {
	public static void main(String[] args) {
		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Null pointer excep");
	}
}
