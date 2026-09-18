package com.oop.shapeWithConst;

public class TestShape {

	public static void main(String[] args) {

		Shape[] arr = new Shape[3];

		arr[0] = new Circle(3);
		arr[1] = new Triangle(2, 4);
		arr[2] = new Rectangle(3, 2);

		for (int i = 0; i < arr.length; i++) {
			arr[i].area();
		}

	}

}
