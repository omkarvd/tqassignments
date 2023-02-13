package com.question1;

public class Student {
	private int rollNum;
	private String sname;
	private Department department;

	public Student() {

	}

	public Student(int rollNum, String sname) {

		this.rollNum = rollNum;
		this.sname = sname;

	}

	public Student(int rollNum, String sname, Department department) {
		this(rollNum, sname);
		this.department = department;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return "Student [rollNum=" + rollNum + ", sname=" + sname + ", department=" + department + "]";
	}

}
