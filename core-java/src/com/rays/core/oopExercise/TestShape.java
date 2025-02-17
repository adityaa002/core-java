package com.rays.core.oopExercise;

public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Circle();
		Circle c = (Circle) s1;
		c.setColor("Blue");
		c.setRadius(3);

		Shape s2 = new Rectangle();
		Rectangle r = (Rectangle) s2;
		r.setColor("Black");
		r.setLength(4);
		r.setWidth(6);

		Shape s3 = new Triangle();
		Triangle t = (Triangle) s3;
		t.setBase(5);
		t.setHeight(9);
		t.setColor("Green");

		s1.area();
		s2.area();
		s3.area();

	}

}
