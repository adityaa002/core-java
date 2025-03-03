package com.rays.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinary {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\aaead\\Desktop\\gow.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\aaead\\Desktop\\rays\\god.jpg");

		int ch = in.read();

		while (ch != -1) {
			out.write(ch);
			ch = in.read();

		}

		out.close();
		in.close();
	}

}
