package com.question11;

public class Student {
	private int id;
	private String name;

	// static String SchoolName = "New English School";
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

//	public static String getSchoolName() {
//		return SchoolName;
//	}
//
//	public static void setSchoolName(String schoolName) {
//		SchoolName = schoolName;
//	}

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
