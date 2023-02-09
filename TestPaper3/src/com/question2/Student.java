//Write a java program to create a Student class (id, name, age, marks). Create constructors, getter, setter and to string method. 
//Create another class and create 2 object of student class and print the details.
//Also calculate how many students are registered (Hint: Static)

package com.question2;

public class Student {
	int id;
	String name;
	int age;
	float marks;
	static int countStudents = 0;

	{
		countStudents++;
	}

	Student() {

	}

	public Student(int id, String name, int age, float marks) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}

	public void setCountStudents(int countStudent) {
		Student.countStudents = countStudents;
	}

	public int getCountStudents() {
		return countStudents;
	}

	public String toString() {
		return "Students details : " + id + " " + name + " " + age + " " + marks;
	}

}
