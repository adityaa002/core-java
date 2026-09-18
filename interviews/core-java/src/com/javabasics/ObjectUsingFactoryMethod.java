package com.javabasics;

import java.util.Calendar;

public class ObjectUsingFactoryMethod {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Object created using factory method : " + c.getTime());
	}

}
