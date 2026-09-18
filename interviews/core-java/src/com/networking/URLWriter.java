package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {
	public static void main(String[] args) throws IOException {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Dashboard");

		String que = "java";

		URLConnection conn = url.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		out.write("q=" + que);

		out.close();

		InputStream in = conn.getInputStream();

		conn.connect();

		Scanner sc = new Scanner(in);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}