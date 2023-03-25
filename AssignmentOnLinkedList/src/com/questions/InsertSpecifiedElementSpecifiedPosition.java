package com.questions;

// WAP to insert the specified element at the specified position in the linked list
import java.util.LinkedList;

public class InsertSpecifiedElementSpecifiedPosition {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("mango");
		llist.add("Banana");
		llist.add("Grapes");
		llist.add(1, "Watermelon");
		System.out.println(llist);
	}

}
