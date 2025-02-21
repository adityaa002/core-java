package com.rays.core.exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryFinallyBlock {
	public static void main(String[] args) throws IOException {
		InputStream input = null;

		try {
			input = new FileInputStream("File.txt");
			int data = input.read();
			while (data != -1) {
				System.out.println((char) data);
				data = input.read();

			}

		} finally {
			if (input != null) {
				input.close();
			}

		}
	}
}
