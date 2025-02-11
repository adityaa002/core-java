package com.rays.core.shapeArrayWithCnstr;

public class TestShape {
	public static void main(String[] args) {

		Shape s1 = new Rectangle();

		Rectangle r = (Rectangle) s1;
		r.setLength(20);
		r.setWidth(10);

		Shape s2 = new Circle();
		Circle c = (Circle) s2;
		c.setRadius(7);

		Shape s3 = new Triangle();
		Triangle t = (Triangle) s3;
		t.setBase(4);
		t.setHeight(5);
		
		s1.area();
		s2.area();
		s3.area();
	}

}
