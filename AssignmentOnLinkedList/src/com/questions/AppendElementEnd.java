//WAP to append the specified element to the end of a linked list
package com.questions;

import java.util.LinkedList;

public class AppendElementEnd {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Omkar");
		llist.add("dhoni");
		llist.add("virat");
		System.out.println(llist);

		llist.add("jadeja");
		System.out.println(llist);
	}

}
