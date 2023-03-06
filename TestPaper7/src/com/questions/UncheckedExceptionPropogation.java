package com.questions;

public class UncheckedExceptionPropogation {

	void m() {
		int data = 50 / 0; // unchecked exception occurred
		// exception propagated to n()
	}

	void n() {
		m();
		// exception propagated to p()
	}

	void p() {
		try {
			n(); // exception handled
		} catch (Exception e) {
			System.out.println(e);
			// System.out.println("\"Exception handled\"");
		}
	}

	public static void main(String args[]) {
		UncheckedExceptionPropogation obj = new UncheckedExceptionPropogation();
		obj.p();
		System.out.println("Normal flow...");
	}
}
