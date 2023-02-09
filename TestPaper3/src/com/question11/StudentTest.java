package com.question11;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("Before Count : No of students = " + Student.studCount);
		Student s1 = new Student(1, "Omkar");
		Student s2 = new Student(2, "Om");
		System.out.println("After count : No of Students = " + Student.studCount);

	}
}
