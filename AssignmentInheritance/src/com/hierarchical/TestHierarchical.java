//In this java program, Computer department and Science department classes both are child classes of Teacher class (parent class)
package com.hierarchical;

class Teacher {

	public void programming() {
		System.out.println("Java programming...");
	}

	void physics() {

		System.out.println("Physics...");
	}

	void chemistry() {

		System.out.println("Chemistry...");

	}
}

// Inherits feature of Teacher class
class ComputerDepartment extends Teacher {

	public void learn() {
		System.out.println("ComputerDepartment : Learn...");
	}

}

// Inherits feature of same Teacher class
class ScienceDepartment extends Teacher {

	public void learn() {
		System.out.println("\nScienceDepartment : Learn...");
	}
}

/*
 * Test hierarchical inheritance
 */
public class TestHierarchical {

	public static void main(String[] args) {

		ComputerDepartment cd = new ComputerDepartment();
		cd.learn();
		cd.programming();

		// Science department
		ScienceDepartment sd = new ScienceDepartment();
		sd.learn();
		sd.physics();
		sd.chemistry();

	}

}