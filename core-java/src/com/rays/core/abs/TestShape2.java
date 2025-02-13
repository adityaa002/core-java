package com.rays.core.abs;

public class TestShape2 {

	public static void main(String[] args) {

		Shape s = new Circle();

		s.area();
		s.sum();

		Rectangle rectangle = new Rectangle();

		rectangle.area();

		Shape.sum(); // static method of shape

	}
}
