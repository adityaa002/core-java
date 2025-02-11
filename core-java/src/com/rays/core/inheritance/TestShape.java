package com.rays.core.inheritance;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();

		s.setBorderWidth(1000);
		s.setColor("Shape colour");

		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());

		Rectangle r = new Rectangle();
		r.setLength(20);
		r.setWidth(40);
		r.setBorderWidth(200);
		r.setColor("red");

		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		r.area();

		Circle c = new Circle();
		c.setBorderWidth(300);
		c.setColor("Blue");
		c.setRadius(9);

		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		c.area();

		Triangle t = new Triangle();
		t.setBase(30);
		t.setHeight(40);
		t.setBorderWidth(400);
		t.setColor("White");

		System.out.println(t.getBase());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		System.out.println(t.getHeight());
		t.area();

	}
}
