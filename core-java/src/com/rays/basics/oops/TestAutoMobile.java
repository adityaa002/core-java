package com.rays.basics.oops;

public class TestAutoMobile {
	public static void main(String[] args) {

		AutoMobile car1 = new AutoMobile();
		AutoMobile car2 = new AutoMobile();
		AutoMobile car3 = new AutoMobile();

		// Storing information
		car1.setMake("Toyota");
		car1.setColor("Black");
		car1.setMaxSpeed(340);

		car2.setMake("Subaru");
		car2.setColor("white");
		car2.setMaxSpeed(550);

		car3.setMake("RangeRover");
		car3.setColor("Matte Black");
		car3.setMaxSpeed(400);

		// Retrieving info

		car1.getCarDetails();
		System.out.println();
		car2.getCarDetails();
		System.out.println();
		car3.getCarDetails();

		car1.acceleration(60);
		car1.applyBreaks();

		car1.changeGear(25);
		System.out.println();
		car1.changeGear(30);
		System.out.println();
		car1.changeGear(50);
		System.out.println();
		car1.changeGear(100);
		System.out.println();

		car1.slowDown(50);
		System.out.println();
		car1.slowDown(90);
		System.out.println();

	}
}