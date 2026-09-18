package com.exception;

public class TestStringIndexOutOfBoundException {

	public static void main(String[] args) {

		String name = "aditya";

		try {
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
