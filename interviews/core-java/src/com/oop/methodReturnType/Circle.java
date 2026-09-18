package com.oop.methodReturnType;

public class Circle extends Shape {

	private int radius;
	private static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;

	}

	public void area() {
		System.out.println("Area of circle : " + PI * radius * radius);
	}

}
