package com.rays.core.inheritance;

public class ShapeTypeCasting {

	public static void main(String[] args) {
		Shape s = new Shape();

		Circle c = new Circle();

		Rectangle r = new Rectangle();

		Triangle t = new Triangle();

		Shape shape = new Rectangle();
		Rectangle rectangle = (Rectangle) shape;
 		rectangle.setColor("Black");
		System.out.println(rectangle.getColor());
 	 
		
	}

}
