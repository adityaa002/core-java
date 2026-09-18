package com.oop.withoutConst;

public class TestShape {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		s[0]= new Rectangle();
		s[1]= new Circle();
		s[2]= new Triangle();

		Rectangle r = (Rectangle) s[0];
		r.setBredth(2);
		r.setLength(3);

		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(7);

		Circle c = (Circle) s[1];
		c.setRadius(3);
		
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}
