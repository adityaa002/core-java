package com.rays.basics.practice;

public class ClassToCall {
	
	public static void main(String[] args) {
		
		MethodToCall mtc = new MethodToCall();
		
		mtc.getAddition(10, 20);
		mtc.getDivision(100, 5);
		mtc.getSubtrtaction(200, 4);
		mtc.getMultiplication(100, 200);
MethodToCall.getDetails("Aditya", 22);		
	}

}
