package com.rays.core.exceptionHandling;

public class TestNumFormatException {
	public static void main(String[] args) {
		String str = "abc123";

		try {

			int i = Integer.parseInt(str);
			System.out.println(str);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
