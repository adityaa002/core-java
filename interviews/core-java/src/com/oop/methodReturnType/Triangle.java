package com.oop.methodReturnType;

public class Triangle extends Shape {

	private int height;
	private int base;

	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public void area() {

		System.out.println("Area of triangle : " + height * base);

	}

}
