//WAP to insert some elements at the specified position into a linked list.
package com.questions;

import java.util.LinkedList;

public class InsertAtSpecifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		llist.add(2, "cheeku");
		System.out.println(llist);
	}

}
