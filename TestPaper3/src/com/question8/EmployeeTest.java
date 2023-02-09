package com.question8;

public class EmployeeTest {

	public static void main(String[] args) {
		Department d1 = new Department("Technical", "Pune");
		Department d2 = new Department("Technical", "Mumbai");
		Department d3 = new Department("HR", "Pune");

		Employee e1 = new Employee(101, "Omkar", d1);
		Employee e2 = new Employee(116, "Sanju", d2);
		Employee e3 = new Employee(114, "Viju", d3);
		Employee e4 = new Employee(112, "Rohit", d1);
		Employee e5 = new Employee(111, "Virat", d2);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}

}
