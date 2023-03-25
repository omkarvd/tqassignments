// WAP to retrieve an element (at a specified index) from a given ArrayList
package com.assignment;

import java.util.ArrayList;

public class RetrieveElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");

		System.out.println(list);
		// Retrive the first and third element
		String element = list.get(0);
		System.out.println("First element: " + element);
		element = list.get(2);
		System.out.println("Third element: " + element);
	}
}
