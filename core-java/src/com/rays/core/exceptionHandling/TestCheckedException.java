package com.rays.core.exceptionHandling;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
			dad();
		} catch (CheckedCustomException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void dad() throws CheckedCustomException {
		mom();
	}

	public static void mom() throws CheckedCustomException {
		son();
	}

	public static void son() throws CheckedCustomException {

		CheckedCustomException c = new CheckedCustomException("Exception Caught");
		throw c;
	}

}