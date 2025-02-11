package com.rays.core.oops;

public class AutoMobile {

	private String color;
	private int speed;
	private String make;
	private int maxSpeed;
	public static final int NO_OF_GEARS = 6;

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setMake(String m) {
		make = m;
	}

	public String getMake() {
		return make;
	}

	// break
	// chng gear
	// getspeed
	// acceleration
	public void applyBreaks() {
		System.out.println("Appling breaks...");
		speed = 0;
		System.out.println("breaks applied !  Car has been stopped");

	}

	public void slowDown(int speed) {
		if (speed > 80) {
			System.out.println("Warning ! , apply breaks");
			System.out.println("Your speed is : " + speed);

			this.speed = 60;
			System.out.println("Now your speed decreased to : " + this.speed);
			System.out.println("Have a Safe Journey !");

		} else {
			System.out.println("Have a safe drive");
			System.out.println("Your speed is : " + speed);
		}

	}

	public void changeGear(int speed) {
		if (speed > 20 && speed < 30) {
			System.out.println("UpShift the gear to 2nd");
			this.speed = 30;
			System.out.println("Current speed : " + speed);
		} else if (speed >= 30 && speed < 40) {
			System.out.println("UpShift the gear to 3nd");
			this.speed = 50;
			System.out.println("Current speed : " + speed);

		} else if (speed >= 50 && speed <= 90) {
			System.out.println("UpShift the gear to 4nd");
			this.speed = 100;
			System.out.println("Current speed : " + speed);

		} else {
			System.out.println("keep driving ! you're in perfect speed");
		}
	}

	public void getSpeed() {
		System.out.println("Speed is " + speed);

	}

	public void acceleration(int toSpeed) {
		speed += toSpeed;
		System.out.println("Accelerating.... now speed is : " + speed);
	}

	public void getCarDetails() {
		System.out.println("Details of car");
		System.out.println("Maker of car : " + make);
		System.out.println("Colour of car : " + color);
		System.out.println("No of gears in car : " + NO_OF_GEARS);
		System.out.println("Max speed of car : " + maxSpeed);
	}
}
