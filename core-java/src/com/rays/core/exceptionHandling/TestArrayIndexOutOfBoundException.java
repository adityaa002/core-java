package com.rays.core.exceptionHandling;

public class TestArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int[] marks = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(marks[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Arr index out of bound exp");
	}
}
