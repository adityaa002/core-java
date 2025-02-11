package com.rays.core.oops;

public class MyShapes {

	public static void main(String[] args) {
		Shapes s = new Shapes();
		s.setColor("red");

		System.out.println(s.getColor());

		s.setBorderWidth(100);
		System.out.println(s.getborderWidth());
		
		System.out.println(s.PI);
	}

}
