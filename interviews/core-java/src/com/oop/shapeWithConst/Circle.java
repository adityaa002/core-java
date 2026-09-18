package com.oop.shapeWithConst;

public class Circle extends Shape {

	int radius;
	public static final double PI = 3.14;

	public Circle(int radius) {

		this.radius = radius;
	}

	@Override
	public void area() {

		System.out.println("Area of cricle : " + PI * radius * radius);

	}

}
