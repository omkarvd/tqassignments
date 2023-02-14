package com.hierarchical;

public class RacingBike extends Bike {
	private int speed;

	RacingBike() {

	}

	RacingBike(String company, float price, int speed) {
		super(company, price);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Racing Bike :" + super.toString() + " " + speed;
	}

}
