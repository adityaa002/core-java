package com.rays.core.io;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\aaead\\Desktop\\rays\\io\\obj.txt");
		file.renameTo(new File("C:\\Users\\aaead\\Desktop\\rays\\io\\obj11.txt"));
		System.out.println("Done");
	}
}
