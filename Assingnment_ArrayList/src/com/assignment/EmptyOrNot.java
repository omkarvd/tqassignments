//. WAP to test an ArrayList is empty or not
// WAP to check if collection is empty

package com.assignment;

import java.util.ArrayList;

public class EmptyOrNot {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Saffron");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Black");

		System.out.println("Is collection empty or not :" + colors.isEmpty());
	}

}
