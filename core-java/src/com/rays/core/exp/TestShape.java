package com.rays.core.exp;

public class TestShape {
	public static void main(String[] args) {
		
		
		Rectangle r = new Rectangle(10, 20, "black", 50);
 
 
		System.out.println("Length : " + r.getLength());
		System.out.println("Width : " + r.getWidth());
		System.out.println("BorderWidth : " + r.getBorderWidth());
		System.out.println("Color : " + r.getColor());
	}

}
