package com.single;

class Animal {
	void eat() {
		System.out.println("Eating..");
	}

	void bark() {
		System.out.println("Barking...");
	}
}

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
