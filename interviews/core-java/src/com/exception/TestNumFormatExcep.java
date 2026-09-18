package com.exception;

public class TestNumFormatExcep {
	public static void main(String[] args) {
		String s = "aditya212";

		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
