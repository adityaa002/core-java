package com.rays.core.practice;

public class Exp2 {
	public static void main(String[] args) {
		String name = "vijay";

		try {
			System.out.println(name.charAt(5));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
