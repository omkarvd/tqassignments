//Write a program to sort array of employees in question 6 in descreasing order of salary.(use array list)
package com.paper;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;

	Employee() {

	}

	Employee(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
