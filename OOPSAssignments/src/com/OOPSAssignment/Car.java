//5) Write a program for class and object : (initialization through reference)
//Note : Initializing object simply means storing data into object
//7) Write a program to create multiple objects of one type only.

//  Main within class

package com.OOPSAssignment;

public class Car {
	String carName;
	String carCompany;
	long carPrice;

	public static void main(String[] args) {
		Car c = new Car();// single object
		Car c1 = new Car();// multiple object
		c.carName = "Portofino";
		c.carCompany = "Ferrari";
		c.carPrice = 35000000;

		c1.carName = "8 series";
		c1.carCompany = "BMW";
		c1.carPrice = 15000000;
		System.out.println(c.carName + " " + c.carCompany + " " + c.carPrice);
		System.out.println(c1.carName + " " + c1.carCompany + " " + c1.carPrice);
	}
}
