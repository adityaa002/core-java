package com.rays.basics.initialPrograms;

public class switchCases {
public static void main(String[] args) {
	int size = args.length;
	switch(size) {
	case 0:
		System.out.println("Usage : hello JavaAll n1 n2 n3 n4");
		break;
	case 1:
        System.out.println(" Hello : "+ args[0]);
        break;
    default:
    	for(int i = 0 ; i < args.length;i++) {
    		System.out.println(i + " Hello : " + args[i]);
        }
	}
}	
}
