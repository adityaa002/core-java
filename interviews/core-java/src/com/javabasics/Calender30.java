package com.javabasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender30 {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		for (int i = 1; i <= 12; i++) {
			c.add(Calendar.DATE, 30);
			System.out.println(sdf.format(c.getTime()));

		}
	}

}
