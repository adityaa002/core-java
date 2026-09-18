package com.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {

		Socket server = new Socket("localhost", 1235);

		System.out.println("Connected to server..!");

		BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));

		DataOutputStream out = new DataOutputStream(server.getOutputStream());

		out.writeBytes("Hello Server..");

		String greet = in.readLine();

		System.out.println("Recieved from Server : " + greet);

		out.close();
		in.close();
		server.close();
		System.out.println("Server Closed...!");

	}
}
