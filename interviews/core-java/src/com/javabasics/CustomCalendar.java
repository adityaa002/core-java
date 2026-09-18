package com.javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomCalendar {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date = sdf.parse("26/07/2002");

		Calendar c = Calendar.getInstance();

		c.setTime(date);

		for (int i = 1; i <= 12; i++) {
			c.add(Calendar.DATE, 30);
			System.out.println(sdf.format(c.getTime()));
		}

	}

}
