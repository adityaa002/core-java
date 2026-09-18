package com.oop.deepCloning;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee("aditya", 1000);
		Employee e2 = new Employee("Chetan", 500);
		

		System.out.println(e1.getName() + " : " + e1.getSalary());
		System.out.println(e2.getName() + " : " + e2.getSalary());
	}
}
