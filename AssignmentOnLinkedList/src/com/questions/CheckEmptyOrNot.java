// WAP to test a linked list is empty or not
package com.questions;

import java.util.LinkedList;

public class CheckEmptyOrNot {

	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);
		System.out.println(" empty or not" + c1.isEmpty());

	}

}
