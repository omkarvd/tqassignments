//. WAP to retrieve but does not remove, the first element of a linked list
package com.questions;

import java.util.LinkedList;

public class RetriveButNotRemovefFirstElement {

	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);

		String x = c1.peekFirst();
		System.out.println("First element in the list: " + x);
		System.out.println("Original linked list: " + c1);
	}

}
