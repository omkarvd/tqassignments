package com.hierarchical;

public class MountainBike extends Bike {
	private int seatHeight;

	MountainBike() {

	}

	MountainBike(String company, float price, int seatHeight) {
		super(company, price);
		this.seatHeight = seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public String toString() {
		return "MountainBike :" + super.toString() + " " + seatHeight;
	}
}
