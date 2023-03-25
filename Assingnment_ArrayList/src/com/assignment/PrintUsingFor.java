//WAP to iterate through all elements in an ArrayList using for loop
package com.assignment;

import java.util.ArrayList;

public class PrintUsingFor {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Omkar");
		names.add("Omi");
		names.add("oma");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
