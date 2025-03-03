package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCharbyChar {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io.txt");
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);

			i = fr.read();
		}

		fr.close();
	}

}
