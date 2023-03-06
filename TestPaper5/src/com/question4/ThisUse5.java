// to pass as argument in the constructor call

package com.question4;

class B {
	ThisUse5 obj;

	B(ThisUse5 obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of A4 class
	}
}

public class ThisUse5 {
	int data = 10;

	ThisUse5() {
		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) {
		ThisUse5 a = new ThisUse5();
	}
}
