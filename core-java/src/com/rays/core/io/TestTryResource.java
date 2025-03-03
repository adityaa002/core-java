package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestTryResource {

	public static void main(String[] args) throws Exception {
		try (FileReader file = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io.txt")) {

			int i = file.read();
			while (i != -1) {
				System.out.print((char) i);
				i = file.read();

			}

		}
	}
}