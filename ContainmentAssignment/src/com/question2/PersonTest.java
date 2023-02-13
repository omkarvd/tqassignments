package com.question2;

public class PersonTest {

	public static void main(String[] args) {
		Address a1 = new Address("Pune", "Maharashtra", "India");
		Address a2 = new Address("Mumbai", "Maharashtra", "India");

		Person p1 = new Person("Sandy", "Male", 22, a1);
		Person p2 = new Person("Rani", "Female", 20, a2);

		System.out.println(p1);
		System.out.println(p2);

	}

}
