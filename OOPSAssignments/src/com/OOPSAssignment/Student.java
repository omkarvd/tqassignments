//1. create class Student
//2. create 2 objects of Student using new keyword
//3) Write a program for class and object : (main method inside class)

package com.OOPSAssignment;

public class Student {
	int rollNum;
	float marks;
	String sName;

	void acceptDetails(int r, float m, String name) {
		rollNum = r;
		marks = m;
		sName = name;
	}

	void showDetails() {
		System.out.println("Roll Number :" + rollNum + "  Marks:" + marks + "  Name :" + sName);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.acceptDetails(1, 70.90f, "Sunny");

		Student s2 = new Student();
		s2.acceptDetails(2, 88.88f, "Kamlesh");

		s1.showDetails();
		s2.showDetails();
	}

}
