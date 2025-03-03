package com.rays.core.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io1.txt"	);

		fw.write("Hey, Aditya\n");
		fw.write("How Are You ! \n");
		fw.write("Goodbye");

		fw.close();
	}
}
