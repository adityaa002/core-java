package com.rays.core.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {
	public static void main(String[] args) {
			Date d = new Date();
			System.out.println("Date in def format : "+d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str = sdf.format(d);
	System.out.println("Date in String format : "+str);
	}

}
