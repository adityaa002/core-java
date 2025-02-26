package com.rays.core.autoBoxingUnboxing;

public class WrapperToPrimitive {
	public static void main(String[] args) {

		double d = 5.5;
		Double dobj = new Double(d);
		Double d1 = dobj.doubleValue();
		System.out.println(d1);

		char c = 'C';
		Character cObj = new Character(c);
		char c1 = cObj.charValue();
		System.out.println(c1);

		boolean b = true;
		Boolean bObj = new Boolean(b);
		boolean b1 = bObj.booleanValue();
		System.out.println(b1);

		int i = 5;
		Integer iObj = new Integer(i);
		int i1 = iObj.intValue();
		
		System.out.println(i1);
	}
}
