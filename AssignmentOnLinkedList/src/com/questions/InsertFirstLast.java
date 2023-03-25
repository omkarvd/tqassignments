// WAP to insert elements into the linked list at the first and last position.
package com.questions;

import java.util.LinkedList;

public class InsertFirstLast {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		llist.addFirst("Watermelon");
		llist.addLast("Strawberry");
		System.out.println(llist);
	}

}
