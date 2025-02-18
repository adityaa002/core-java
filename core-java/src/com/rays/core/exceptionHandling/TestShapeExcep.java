package com.rays.core.exceptionHandling;

public class TestShapeExcep {
	public static void main(String[] args) {
		try {
			RectangleShape rs = new RectangleShape(" ", -9);
			rs.getInfo();
		} catch (ShapeException e) {
			e.printStackTrace();

		}

		System.out.println("after");
	}
}
