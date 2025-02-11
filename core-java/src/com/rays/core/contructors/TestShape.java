package com.rays.core.contructors;

public class TestShape {

	public static void main(String[] args) {
		Shape s = new Shape();
		Shape s1 = new Shape("Blue", 200);

		s.setBorderWidth(100);// set method used to assign values
		s.setColor("Red");

		System.out.println(s.getBorderWidth()); // printed values using getters
		System.out.println(s.getColor());

		System.out.println(s1.getBorderWidth());
		System.out.println(s1.getColor());

		s1.setBorderWidth(400);
		s1.setColor("Black");

		System.out.println(s1.getBorderWidth());
		System.out.println(s1.getColor());
	}
}