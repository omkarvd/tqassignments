//Create an employee class having id, name, salary, experience, age, role. Create overloaded method to display employee details.
//displayEmployee(): will display name, salary and experience 
//displayEmployee (int id): will display all the details 

package com.question4;

public class Employee {
	int id;
	String name;
	float salary;
	int exp;
	int age;
	String role;

	public void displayEmployee(String name, float salary, int exp) {
		System.out.println(" name : " + name + " Salary : " + salary + " Experience : " + exp);
	}

	public void displayEmployee(int id, String name, float salary, int exp, int age, String role) {
		System.out.println(" Id  : " + id + " Name : " + name + " Salary : " + salary + " Experiance : " + exp
				+ " Age : " + age + " Role : " + role);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.displayEmployee("Suyog", 100000f, 3);
		e.displayEmployee(1, "Vivek", 100000f, 3, 27, "Developer");
		e.displayEmployee(1, "Omkar", 100000f, 3, 27, "Developer");

	}
}
