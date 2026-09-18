package com.oop.withoutConst;

public class Circle extends Shape {

	private int radius;
	public static final double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double getPi() {
		return PI;
	}

	@Override
	public void area() {
		System.out.println("Area of circle:" + PI * radius * radius);
	}
}
