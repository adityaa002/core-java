package com.rays.core.override;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.area();
		Rectangle r = new Rectangle();
		r.area();

		Shape s1 = new Rectangle();
		s1.area();

	}

}
