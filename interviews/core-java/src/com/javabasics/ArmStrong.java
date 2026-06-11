package com.javabasics;

public class ArmStrong {
	public static void main(String[] args) {

		int num = 153;
		int r = 0;
		int temp = 0;
		int num2 = num;

		while (num2 > 0) {
			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;

		}
		if(temp == num) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not an ArmStrong Number");

		}

	}
}
