package com.rays.basics.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCustomCalendar {
	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		String str = "01/02/2025";
//
//		Date d = sdf.parse(str);
//
//		Calendar cal = Calendar.getInstance();
//
//		cal.setTime(d);
//		cal.add(Calendar.DATE, 4);
//
//		Date nextDate = cal.getTime();
//		
//		System.out.println(sdf.format(nextDate));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// String str = "01/02/2025";

		// Date d = ;

		Calendar cal = Calendar.getInstance();

		cal.setTime(sdf.parse("01/02/2025"));
		cal.add(Calendar.DATE, 4);

		// Date nextDate = cal.getTime();

		System.out.println(sdf.format(cal.getTime()));

	}

}
