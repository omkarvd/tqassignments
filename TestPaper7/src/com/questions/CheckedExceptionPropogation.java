//Write a program to illustrate propagation of checked exception...
package com.questions;

import java.io.IOException;

public class CheckedExceptionPropogation {

	static void exe() throws IOException {
		throw new IOException("Error in device");

	}

	static void p() throws IOException {
		exe();

	}

	static void n() throws IOException {

		p();
	}

	public static void main(String[] args) {

		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
