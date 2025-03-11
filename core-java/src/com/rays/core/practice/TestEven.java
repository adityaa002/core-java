package com.rays.core.practice;

public class TestEven {
	public static void main(String[] args) {
		CheckEven ec = (a) -> {
			if (a % 2 == 0) {
				System.out.println(a + " is Even number.");
			} else {
				System.out.println(a + " is Odd number.");
			}
		};

		ec.evenOdd(10);
		ec.evenOdd(9);
	}

}
