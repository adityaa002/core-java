package com.rays.core.io;

import java.io.File;

public class FileObject {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\aaead\\Desktop\\rays\\io");
		String[] files = folder.list();

		for (String f : files) {
			System.out.println(f);
		}
	}
}