package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket(2345);

		System.out.println("Server started..!");

		byte[] bt = new byte[256];

		DatagramPacket packet = new DatagramPacket(bt, bt.length);

		socket.receive(packet);

		String recieved = new String(packet.getData(), 0, packet.getLength());

		System.out.println("Recieved from Client : " + recieved);

		bt = "Hello Client".getBytes();

		packet = new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());

		socket.send(packet);

		socket.close();
		System.out.println("Server Closed..!");

	}

}
