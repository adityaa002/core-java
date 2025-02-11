package com.rays.core.practice;

public class StringToPrimitive {
	public static void main(String[] args) {
		int i = Integer.parseInt("10");
		System.out.println(i);

		byte by = Byte.parseByte("02");
		System.out.println(by);

		short s = Short.parseShort("00001");
		System.out.println(s);

		long l = Long.parseLong("7828788678");
		System.out.println(l);

		char c = "a".charAt(0);
		System.out.println(c);

		boolean b = Boolean.parseBoolean("True");
		System.out.println(b);
		
		
		float f= Float.parseFloat("0.44f");
		System.out.println(f);
		
		double d = Double.parseDouble("88.999d");
		System.out.println(d);

	}
}
