package com.rays.core.shapeArray;

public class TestShape2 {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[2] = new Triangle();

		Circle c = (Circle) shape[0];
		c.setRadius(3);

		Rectangle r = (Rectangle) shape[1];
		r.setLength(5);
		r.setWidth(10);

		Triangle t = (Triangle) shape[2];
		t.setBase(10);
		t.setHeight(8);

		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
	}

}
