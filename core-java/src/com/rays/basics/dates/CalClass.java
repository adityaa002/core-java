package com.rays.basics.dates;

import java.util.Calendar;
import java.util.Date;

public class CalClass {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 30);
		Date d = cal.getTime();
		System.out.println(d);
	}

}
