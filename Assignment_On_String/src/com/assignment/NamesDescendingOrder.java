//1.	Create an array of 10 names sort in descending order
package com.assignment;

import java.util.Arrays;
import java.util.Collections;

public class NamesDescendingOrder {
	public static void main(String[] args) {
		String[] names = { "Rahul", "Neha", "Rohan", "Priya", "Alok", "Sneha", "Ankit", "Pooja", "Gaurav", "Omkar" };
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(" names  descending order:");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
