// WAP to get the first and last occurrence of the specified elements in a linked list
package com.questions;

import java.util.LinkedList;

public class GetFirstLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		System.out.println("First occurence :" + llist.getFirst());
		System.out.println("Last occurence :" + llist.getLast());
	}

}
