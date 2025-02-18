package com.rays.core.exceptionHandling;

 
public class TestAllExcp {
	public static void main(String[] args) {
		try {

			MathClass m1 = new MathClass(100, 10);
			System.out.println(m1.getDivision());

			ArrayClass ac = new ArrayClass();
		System.out.println(ac.getElementAtIndex(3));	
		
		StringClass sc = new StringClass("vijay");
		System.out.println(sc.getCharAtIndex(7));

		} catch (OverAllException e) {
			System.out.println(e.getMessage());
		}

	}
}
