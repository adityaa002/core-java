package com.rays.core.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLinebyLine {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io.txt");

		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();

		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
		file.close();
	}

}
