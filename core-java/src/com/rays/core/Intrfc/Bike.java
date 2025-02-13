package com.rays.core.Intrfc;

public class Bike implements Vehicle {

	private int speed;
	private int fuelLevel;

	public Bike(int fuelLevel) {
		this.fuelLevel = fuelLevel;

	}

	@Override
	public void start() {
		if (fuelLevel > 0) {
			System.out.println("Bike has Startingg.....Started");
		} else {
			System.out.println("Insufficient fuel.....Refuel the Tank !");
		}

	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Bike has been Stopped");

	}

	@Override
	public void refuling(int fuelAmount) {
		fuelLevel = fuelLevel + fuelAmount;
		System.out.println("Refuling...... Refueld!  Fuel Level " + fuelLevel + "Litre");

	}

	@Override
	public void accelerate(int increment) {
		if (fuelLevel > 0) {
			speed += speed + increment;
			fuelLevel = increment / 3;
			System.out.println("Accelerated to : " + speed + "km/h");
		} else {
			System.out.println("Not enough fuel to Accelerate... Fuel it up");
		}
	}

	@Override
	public void brake(int decrement) {
		speed = Math.max(0, decrement);
		System.out.println("Speed is reduced...  Current Speed : " + speed);

	}

}
