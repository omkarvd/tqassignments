//4) Write a program for class and object : (main outside class)

package com.OOPSAssignment;

class Student2 {
	int id;
	String name;

	void acceptDetails(int i, String n) {
		id = i;
		name = n;
	}

	void showDetails() {
		System.out.println("Id :" + id + " Name :" + name);
	}
}

class StudentDemo2 {

	public static void main(String args[]) {
		Student2 s = new Student2();

		s.acceptDetails(5, "Rahul");
		s.showDetails();
	}
}