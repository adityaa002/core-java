package com.rays.core.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\aaead\\Desktop\\rays\\io\\keyboard.txt");

		if (f.exists()) {

			System.out.println("File name : " + f.getName());
			System.out.println("FilePath : " + f.getAbsolutePath());
			System.out.println();

			System.out.println("Access Permissions");
			System.out.println("It is readable : " + f.canRead());
			System.out.println("Is it writable too? : " + f.canWrite());
			System.out.println();

			System.out.println("Is file ? :" + f.isFile());
			System.out.println("Is directory ? :" + f.isDirectory());
			System.out.println();

			Date d = new Date(f.lastModified());
			System.out.println("Last modified : " + d);

			long l = f.length();
			System.out.println("Length : " + l + " bytes");

		} else {
			System.out.println("File does'nt exist");
		}
	}
}