//WAP to remove first and last element from a linked list
package com.questions;

import java.util.LinkedList;

public class RemoveFirstLast {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		System.out.println("Removing first :" + llist.removeFirst());
		System.out.println("Removing last :" + llist.removeLast());
		System.out.println(llist);

	}

}
