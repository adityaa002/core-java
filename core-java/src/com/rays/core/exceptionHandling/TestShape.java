package com.rays.core.exceptionHandling;

public class TestShape {
	public static void main(String[] args) {

		try {
			Shape s = new Shape(0, 80);
			s.display();

			System.out.println(s.area());
		} catch (ShapeException e) {
			System.out.println(e.getMessage());
		}
	}

}
