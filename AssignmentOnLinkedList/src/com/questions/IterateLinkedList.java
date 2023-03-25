//WAP to iterate through all elements in a linked list
package com.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");

		Iterator<String> itr = llist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
