package com.question1;

public class StudentTest {

	public static void main(String[] args) {
		Department d1 = new Department(101, "Computer");
		Department d2 = new Department(102, "Physics");

		Student s1 = new Student(1, "Sachin", d1);
		Student s2 = new Student(2, "Kapil", d2);

		System.out.println(s1);
		System.out.println(s2);
	}

}
