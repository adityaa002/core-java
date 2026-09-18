package com.oop.shapeWithConst;

public class Triangle extends Shape {
	int base;
	int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle : " + base * height);
	}
}
