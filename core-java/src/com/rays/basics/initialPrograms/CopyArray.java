package com.rays.basics.initialPrograms;

public class CopyArray {
	
	public static void main(String[] args) {
		char[] copyFrom =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
		char[] copyTo = new char[8];
		System.arraycopy(copyFrom, 3, copyTo, 0, 8);
		
		System.out.println(new String(copyTo));
	}
}