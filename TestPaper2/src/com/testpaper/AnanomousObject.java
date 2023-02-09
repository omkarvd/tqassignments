//. Write a program to demonstrate anonymous object.

package com.testpaper;

public class AnanomousObject {

	private int id;
	private String name;
	private int marks;

	public AnanomousObject() {
		System.out.println("I am default counstructor.");
		this.id = 12;
		this.name = "omkar";
	}

	public AnanomousObject(int id, String name, int marks) {
		System.out.println("I am parameterized constructor...");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Datails are=>  " + "id=" + id + " name=" + name + " marks=" + marks);
	}

	public static void main(String[] args) {

		new AnanomousObject().display();
		new AnanomousObject(12, "suyog", 98).display();
	}
}
