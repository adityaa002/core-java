package com.javabasics;

import java.lang.reflect.Constructor;

public class ObjectCreatedUsingReflection {

	public void display() {
		System.out.println("Object Created Using Reflection...!");
	}

	public static void main(String[] args) {

		try {
		Constructor<ObjectCreatedUsingReflection> constructor = ObjectCreatedUsingReflection.class.getDeclaredConstructor();

			ObjectCreatedUsingReflection oc = constructor.newInstance();
			
			oc.display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
