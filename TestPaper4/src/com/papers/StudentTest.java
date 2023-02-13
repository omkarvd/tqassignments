//. Write a program to count the number of student registered in a school
package com.papers;

class Student {
	private int id;
	private String name;
	static int studCount = 0;

	{
		studCount++;
	}

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

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

	public static int getStudCount() {
		return studCount;
	}

	public static void setStudCount(int studCount) {
		Student.studCount = studCount;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Omkar");

		System.out.println(" Number of student registered in a school : " + Student.studCount);

	}

}
