//Write a program to create a class Student having fields id, name, marks (private). Create getter , setters and toString method. Create a Student test class in which create 3 objects . Take the input from the user and then display the details of all the students.

package com.testpaper;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private float marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public void getdetails() {
		Scanner scanner = new Scanner(System.in);
//System.out.println("Details for 1st student=>");
		System.out.println("Enter the student id: ");
		this.id = scanner.nextInt();
		System.out.println("Enter the student name: ");
		this.name = scanner.next();

		System.out.println("Enter the student marks: ");
		this.marks = scanner.nextFloat();
	}

}
