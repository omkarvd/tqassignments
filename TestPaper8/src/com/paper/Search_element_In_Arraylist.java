//Write a Java program to search an element in an array list
package com.paper;

import java.util.ArrayList;

public class Search_element_In_Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Virat");
		a.add("Rohit");
		a.add("Dhoni");
		a.add("Sachin");
		a.add("Jadeja");

		String element = "Virat";
		int index = a.indexOf(element);

		if (index == -1) {
			System.out.println("Element " + element + " not found");
		} else {
			System.out.println("Element " + element + " found at index " + index);

		}
	}

}
