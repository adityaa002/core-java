package com.rays.core.abs;

public class TestShape {
	public static void main(String[] args) {

		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle();
		shape[1] = new Triangle();
		shape[2] = new Circle();

		Rectangle rectangle = (Rectangle) shape[0];
		rectangle.setLength(10);
		rectangle.setWidth(20);

		Triangle triangle = (Triangle) shape[1];
		triangle.setBase(5);
		triangle.setHeight(8);

		Circle circle = (Circle) shape[2];
		circle.setRadius(15);

		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
	}
}
