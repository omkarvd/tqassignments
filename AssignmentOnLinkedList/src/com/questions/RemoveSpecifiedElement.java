//WAP to remove a specified element from a linked list
package com.questions;

import java.util.LinkedList;

public class RemoveSpecifiedElement {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		llist.remove(0);
		// llist.remove(1);
		System.out.println(llist);

	}

}
