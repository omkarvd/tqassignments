//. WAP to iterate through all elements in an ArrayList using for each
package com.assignment;

import java.util.ArrayList;

public class PrintUsingForEach {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Omkar");
		names.add("Omi");
		names.add("oma");
		for (String s : names) {
			System.out.println(s);
		}
	}
}