package com.rays.core.dates;

public class StringToPrimitive {
	public static void main(String[] args) {

		byte by = Byte.parseByte("5");
		System.out.println(by);

		int i = Integer.parseInt("10");
		System.out.println(i);

		short s = Short.parseShort("4");
		System.out.println(s);

		long l = Long.parseLong("58");
		System.out.println(l);

		float f = Float.parseFloat("100f");
		System.out.println(f);

		double d = Double.parseDouble("10d");
		System.out.println(d);

		char c = "s".charAt(0);
		System.out.println(c);

	}
}
