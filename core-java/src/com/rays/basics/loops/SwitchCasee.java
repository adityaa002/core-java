package com.rays.basics.loops;

public class SwitchCasee {
	public static void main(String[] args) {
		int size = args.length;

		switch (size) {
		case 0:
			System.out.println("Hello world");
			break;

		case 1:
			System.out.println("World : " + args[0]);
			break;

		default:
			for (int i = 0; i < size; i++) {
				System.out.println(i + " = hello " + args[i]);

			}
			break;
		}
	}
}
