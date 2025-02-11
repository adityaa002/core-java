package com.rays.core.shapeArray;

public class Circle extends Shape {
	private int radius;
	private static final float PI = 3.14f;

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void area() {
		double cArea = (PI * radius * radius);
		System.out.println("Area of circle : " + cArea);
	}
}
