package com.rays.basics.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestingFormat {
	public static void main(String[] args) throws ParseException {

//		Date d = new Date();
//		System.out.println(d);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		String str = sdf.format(d);
//
//		System.out.println(str);
		String str = "23/01/2025";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(str);
		System.out.println(d);

//		Date d= new Date();
//		System.out.println(d);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        String s1 = sdf.parse(d);;
//        System.out.println(s1);

	}

}
