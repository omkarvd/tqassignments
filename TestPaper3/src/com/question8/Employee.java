package com.question8;

public class Employee {
	private int eid;
	private String ename;
	private Department department;

	Employee() {

	}

	public Employee(int eid, String ename, Department department) {

		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}

}
