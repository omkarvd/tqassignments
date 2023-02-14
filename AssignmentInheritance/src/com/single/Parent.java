package com.single;

public class Parent {

	public String name;
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Parent Name : " + name + "Age : " + age;
	}

}
