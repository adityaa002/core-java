package com.rays.core.exceptionHandling;

public class MathClass {
	public int a;
	public int b;

	public MathClass(int a, int b) throws OverAllException {
		if (a < b || b == 0) {
			OverAllException mce = new OverAllException("Arithmetic Exception Occured : Enter valid parameters");
			throw mce;
		}

		this.a = a;
		this.b = b;
	}

	public double getDivision() {
		return a / b;
	}

}
