//WAP to check if a particular element exists in a linked list.

package com.questions;

import java.util.LinkedList;

public class CheckElementExists {

	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);

		if (c1.contains("Green")) {
			System.out.println("Color Green is present ");
		} else {
			System.out.println("Color Green is not present ");
		}

	}

}
