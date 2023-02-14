package com.multilevel;

class Animal {
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking.");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("Weeping.");
	}
}

public class AnimalDogBabydog {
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();

	}
}
