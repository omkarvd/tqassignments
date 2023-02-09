// Write a java program to create a class Employee(id, name, salary, age, experience) . Create 3 constructors as 
//	Default 
//	Constructor1(take experience as 0)
//	Constructor2(taking all fields)
//Create a Employee test class in a separate package and create 4 objects of employee and then print them

package com.question5;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private int age;
	private int exp;

	public Employee() {

	}

	public Employee(int id, String name, float salary, int age) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.exp = 0;
	}

	public Employee(int id, String name, float salary, int age, int exp) {

		this.id = 101;
		this.name = "Sandip";
		this.salary = 89000f;
		this.age = 22;
		this.exp = 4;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", exp=" + exp + "]";
	}

}
