package com.testpaper;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Details for 1st student=>");
		s1.getdetails();

		System.out.println("***************************");
		System.out.println("Details for second student");
		Student s2 = new Student();
		s2.getdetails();

		System.out.println("***************************");
		System.out.println("Details for Third student");
		Student s3 = new Student();
		s3.getdetails();
		System.out.println("__________________________________________________________");
		System.out.println("Details of all student are=>");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
