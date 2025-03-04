package com.rays.core.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyboard {
	public static void main(String[] args) throws Exception {
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Keyboard.txt");

		String line = in.readLine();

		while ((!line.equals("bye"))) {
			out.println(in);
			line = in.readLine();

		}

		out.close();
		in.close();
		isReader.close();

	}
}
