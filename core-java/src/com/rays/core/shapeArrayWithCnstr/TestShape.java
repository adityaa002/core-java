package com.rays.core.shapeArrayWithCnstr;

public class TestShape {
	public static void main(String[] args) {

		Shape s = new Circle(4);
		Shape s1 = new Rectangle(4, 8);
		Shape s2 = new Triangle(2, 3);
		
		s.area();
		s1.area();
		s2.area();
	}

}
