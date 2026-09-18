package com.oop.methodReturnType;

public class Shape {

	public void area() {
		System.out.println("Area method of shape class");

	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle(3);
		}
		if (i == 2) {
			return new Rectangle(2,3);

		}
		if (i == 3) {
			return new Triangle(2,4);

		}
		return new Shape();
	}

}
