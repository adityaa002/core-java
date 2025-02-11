package com.rays.core.overLoading;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();

		s.area();
		s.area(2, 4);
	Shape shape =new Rectangle();
	Rectangle rectangle = (Rectangle) shape ;
	    Rectangle r =new Rectangle();
	    r.area();
	    r.area(5, 10);
 	}

}
