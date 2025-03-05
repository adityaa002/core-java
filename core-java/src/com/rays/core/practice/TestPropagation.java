package com.rays.core.practice;

public class TestPropagation {

	public void firtst() {

		try {
			second();
		} catch (CustomExp e) {
			System.out.println(e.getMessage());
 		}

	}

	public void second() throws CustomExp {

		CustomExp e = new CustomExp("Custom exception worked");
		throw e;

	}

}
