package com.question4;

public class DriverTest {

	public static void main(String[] args) {
		Car c1 = new Car(444, "Top");
		Car c2 = new Car(555, "Base");
		Car c3 = new Car(666, "Top");

		Driver d1 = new Driver(1223, "Sanjay", 2, c1);
		Driver d2 = new Driver(5665, "NIL", 1, c1);
		Driver d3 = new Driver(9669, "man", 2, c2);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("------------------------");

		c1.setCnum(777);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("--------------------------");

		Driver d4 = new Driver(5665, "Sam", 4);
		System.out.println(d4);

		d4.setCar(c3);

		System.out.println(d4);

	}

}
