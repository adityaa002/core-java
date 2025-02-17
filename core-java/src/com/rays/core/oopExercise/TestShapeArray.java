package com.rays.core.oopExercise;

public class TestShapeArray {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];

		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[2] = new Triangle();

		Circle c = (Circle) shape[0];
		c.setColor("Blue");
		c.setRadius(3);

		Rectangle r = (Rectangle) shape[1];
		r.setColor("Black");
		r.setLength(4);
		r.setWidth(6);

		Triangle t = (Triangle) shape[2];
		t.setBase(5);
		t.setHeight(9);
		t.setColor("Green");

		for (int i = 0; i < shape.length; i++) {
			shape[i].area();

		}

	}

}
