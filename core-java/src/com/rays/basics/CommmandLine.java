package com.rays.basics;

public class CommmandLine {
public static void main(String[] args)throws Exception {
	int ch = System.in.read(); //read data from keyboard
	System.out.println("Selected char ASCII code : "+ ch );
	if(ch=='A'|| ch == 'a') {
		Add.main(args);
	} else if(ch == 'D' || ch == 'd'){
       GetDivision.main(args);
	}else {
		System.out.println("Incorrect choice");
	}
	
}
}
