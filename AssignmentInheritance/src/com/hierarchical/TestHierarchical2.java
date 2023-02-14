package com.hierarchical;

class Animal {
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Meowing");
	}
}

public class TestHierarchical2 {

	public static void main(String[] args) {

		System.out.println("Cat :");
		Cat c = new Cat();
		c.eat();
		c.meow();
		System.out.println();

		System.out.println("Dog :");
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}
