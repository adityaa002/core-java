package com.rays.basics.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestdateFormats {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = format1.format(today);
		System.out.println("Format #1 : " + strDate);

		SimpleDateFormat format2 = new SimpleDateFormat("MMM dd,yyyy");
		String str1 = format2.format(today);
		System.out.println("Format #2 : " + str1);

		Date pdate = format1.parse("15/03/1947");
		System.out.println("Format #3 : " + pdate);

	}
}
