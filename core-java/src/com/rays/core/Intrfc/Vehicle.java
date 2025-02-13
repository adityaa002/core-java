package com.rays.core.Intrfc;

public interface Vehicle {

	public void start();

	public void stop();

	public void refuling(int fuelAmount);

	public void accelerate(int increment);

	public void brake(int decrement);

}
