package com.oop.methodReturnType;

public class TestShape {

	public static void main(String[] args) {

		Shape[] arr = new Shape[3];
		
		arr[0] = Shape.getShape(1);
		arr[1] = Shape.getShape(2);
		arr[2] = Shape.getShape(3);
		

		for (int i = 0; i < arr.length; i++) {
			arr[i].area();

		}

	}

}
