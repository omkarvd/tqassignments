package com.question4;

public class ThisUse4 {
	void m(ThisUse4 obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		ThisUse4 s1 = new ThisUse4();
		s1.p();
	}
}
