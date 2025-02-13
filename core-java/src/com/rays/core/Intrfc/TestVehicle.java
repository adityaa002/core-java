package com.rays.core.Intrfc;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle mycar = new Car(2);
		mycar.start();
		mycar.accelerate(20);
		mycar.accelerate(10);
		mycar.brake(10);
		mycar.refuling(2);
		mycar.stop();

		System.out.println();

		Vehicle mybike = new Bike(6);
		mybike.start();
		mybike.accelerate(15);
		mybike.brake(5);
		mybike.refuling(3);
		mybike.stop();

	}

}
