package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSplitter {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new FileReader("C://Users//Aditya//OneDrive//Desktop//IO//splitter//file.txt"));

		int nol = 6;
		int countLine = 0;

		String s = br.readLine();

		while (s != null) {
			countLine++;
			s = br.readLine();
		}

		int temp = countLine / nol;
		if (countLine % nol != 0) {
			temp++;
		}

		br = new BufferedReader(new FileReader("C://Users//Aditya//OneDrive//Desktop//IO//splitter//file.txt"));

		String str;

		for (int i = 1; i <= temp; i++) {

			PrintWriter out = new PrintWriter(
					new FileWriter("C://Users//Aditya//OneDrive//Desktop//IO//splitter//split" + i + ".txt"));

			for (int j = 1; j <= nol; j++) {
				str = br.readLine();
				if (str == null) {
					break;
				}
				out.println(str);

			}
			out.close();

		}
		System.out.println("Succeed...!");

	}

}
