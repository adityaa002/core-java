package com.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(1235);

		System.out.println("Server started waiting for client..!");

		Socket client = server.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello Client \n");

		String greet = in.readLine();

		System.out.println("Recieved From Client : " + greet);

		out.close();
		in.close();
		client.close();
		System.out.println("Client Closed..!");
	}
}
