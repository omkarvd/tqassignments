package com.question2;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Omkar", 20, 92f);
		Student s2 = new Student(2, "Raj", 20, 90f);
		System.out.println(s1);

		System.out.println(s2);
		System.out.println(Student.countStudents + " Students are register. ");

	}

}
