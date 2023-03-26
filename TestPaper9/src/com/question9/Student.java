//Create a hashmap of student has a course and sort it by student marks
package com.question9;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int marks;
	private Course course;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {

		if (this.getMarks() == s.getMarks())
			return 0;
		else if (this.getMarks() > s.getMarks())
			return 1;
		else
			return -1;

	}
}
