/*1.	. Create a class Cycle with member variables: intaccountNo, intnoOfWheels.
2.	Create a default constructor with a SOP in it “I am default constructor”
3.	Create another constructor which takes 2 arguments, calls the default constructor using this()
and has a SOP in it “I am another constructor”.
4.	In main method, create an object of type Cycle by using default constructor. Note the output.
5.	Create another object of type Cycle by using the parameterized constructor. Note the sequence of SOPs indicating that inner most constructor is called first.
*/

package com.assignments;

public class Car {
	int modelnum;
	int noOfWheels;

	Car() {
		System.out.println("Default constructor");
	}

	public Car(int modelnum, int noOfWheels) {
		this();
		this.modelnum = modelnum;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another constructor");
	}

	void display() {
		System.out.println(modelnum + " " + noOfWheels);
	}

	public static void main(String[] args) {
		Car c = new Car();// o/p - Default contructor
		Car c1 = new Car(1, 5);// op- Default constructor
		c1.display(); // I am another constructor
						// 1 5

	}

}
