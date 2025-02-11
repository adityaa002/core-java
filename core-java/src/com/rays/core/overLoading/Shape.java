package com.rays.core.overLoading;

public class Shape {


	public void area() {
		System.out.println("Shape area method");
	}

	public void area(int a, int b) {
		int area = a*b;
		System.out.println("Area of a shape: " + area);

	}


}
