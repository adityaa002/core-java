package com.rays.core.Intrfc;

public class Car implements Vehicle {
	int speed;
	int fuelLevel;

	public Car(int fuelLevel) {
		this.speed = 0;
		this.fuelLevel = fuelLevel;
	}

	@Override
	public void start() {
		if (fuelLevel > 0) {
			System.out.println("Startring the vehicle.....Started");
		} else {
			System.out.println("Not enough fuel to start !! , Refuel tank");
		}

	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Car has Stopped.....");
	}

	@Override
	public void refuling(int fuelAmount) {
		fuelLevel = fuelLevel + fuelAmount;
		System.out.println("Car refueled. Car fuelLevel: " + fuelLevel + " Litres ");
	}

	@Override
	public void accelerate(int increment) {
		speed += increment;
		fuelLevel = increment / 2;
		if (fuelLevel > 0) {
			System.out.println("Speed is increased by : " + increment + "km/h " + "Now the current speed is : " + speed
					+ "  km/h ");
		} else {
			System.out.println("Insufficient fuel !! ..... Fuel up the tank");
		}

	}

	@Override
	public void brake(int decrement) {
		speed = Math.max(0, speed - decrement);
		System.out.println("Car slowed down... Now the currrent speed is : " + speed + "Km/h");

	}

}
