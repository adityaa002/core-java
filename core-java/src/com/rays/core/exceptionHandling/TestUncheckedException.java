package com.rays.core.exceptionHandling;

public class TestUncheckedException {
	public static void main(String[] args) {
		try {
			dad();
		} catch (CustomUncheckedException ec) {
			System.out.println(ec);
		}
	}

	public static void dad() {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {

		CustomUncheckedException ec = new CustomUncheckedException("Exception Caught.....!!!!!");
		throw ec;
	}
}
