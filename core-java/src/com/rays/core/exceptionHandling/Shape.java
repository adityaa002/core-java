package com.rays.core.exceptionHandling;

public class Shape {
	int length;
	int width;

	public Shape(int length, int width) throws ShapeException {
		if (length <= 0 || width <= 0) {
			ShapeException e = new ShapeException("Enter Valid parameters");
			throw e;
		}
		this.length = length;
		this.width = width;
	}

	public double area() {

		return length * width;

	}

	public void display() {
		System.out.println("Length : " + length + "  width : " + width);
	}

}
