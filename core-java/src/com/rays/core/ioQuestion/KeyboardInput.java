package com.rays.core.ioQuestion;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardInput {
	public static void main(String[] args) throws IOException {

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\10Lines.txt"));
		String line = in.readLine();

		while (!(line.equals("quit"))) {
			out.println(line);
			line = in.readLine();
		}

		out.close();
		in.close();
		isReader.close();
	}
}
