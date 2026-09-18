package com.exception;

public class TryWithFinally {

	public static void main(String[] args) {

		String s = "aditya";

		try {
			System.out.println(s.charAt(6));

		} finally {
			System.out.println("Finally block always executes...!");
		}
	}

}
