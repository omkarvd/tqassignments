package com.hierarchical;

public class BikeTest {

	public static void main(String[] args) {
		MountainBike b = new MountainBike("KTM", 250000f, 6);
		RacingBike r = new RacingBike("Duke", 200000f, 400);
		System.out.println(b);
		System.out.println(r);
	}

}
