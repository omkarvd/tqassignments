//. WAP to iterate through all elements in a linked list starting at the specified position
package com.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateStartingAtSpecifiedCondition {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("a");// 0
		llist.add("b");// 1
		llist.add("c");// 2
		llist.add("d");// 3
		llist.add("e");// 4

		Iterator itr = llist.listIterator(3);
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
