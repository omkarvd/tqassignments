//WAP to remove all the elements from a linked list.
package com.questions;

import java.util.LinkedList;

public class RemoveAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		llist.removeAll(llist);
		System.out.println(llist);
	}

}
