package com.rays.core.loops;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // getting input from user

		switch (size) {

		case 0:
			System.out.println("Hello World : pass some arguments : " + size);
			break;

		case 1:
			System.out.println("Having : " + size + "  argument");
			break;
		case 2:
			System.out.println("Having : " + size + "  argument");
			break;

		default:
			System.out.println("Running default case");
			break;
		}
	}
}
