package com.javabasics;

public class ArmStrong {
	public static void main(String[] args) {
		int num = 153;

		int temp = 0;
		int num2 = num;

		while (num > 0) {
			int r = num % 10; // .3 ,, .5,, .1
			temp = temp + r * r * r; // 27 ,, 152 ,, 153
			num = num / 10; // 15 ,, 1 ,, 0

		}

		if (num2 == temp) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not an ArmStrong Number");
		}

	}
}
