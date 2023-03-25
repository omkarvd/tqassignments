//. WAP to iterate a linked list in reverse order.
package com.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateInReverse {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		Iterator<String> itr = llist.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
