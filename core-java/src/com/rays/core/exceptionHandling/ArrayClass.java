package com.rays.core.exceptionHandling;

public class ArrayClass {

	int[] marks = { 1, 2, 3, 4 };

	public int getElementAtIndex(int index) throws OverAllException {

		if (index >= marks.length) {
			OverAllException ace = new OverAllException(
					"ArrayIndexOutOfBoundsException : Enter valid index !! ");

			throw ace;
		}
		return marks[index];

	}
}