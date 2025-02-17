package com.rays.core.exceptionHandling;

public class TestStringIndexOutOfBounds {
	public static void main(String[] args) {
		String s = "vijay";

		try {
			System.out.println(s.charAt(5));

		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
