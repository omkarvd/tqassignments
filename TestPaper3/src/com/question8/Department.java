//Q8. Create a containment class of Employee having a Department Create 3 department and create 5 object working in different department and display the same .
package com.question8;

public class Department {

	private String dname;
	private String location;

	Department() {

	}

	public Department(String dname, String location) {

		this.dname = dname;
		this.location = location;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "Department [dname=" + dname + ", location=" + location + "]";
	}

}
