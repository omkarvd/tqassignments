//WAP to remove and return the first element of a linked list
package com.questions;

import java.util.LinkedList;

public class RemoveReturnFirstElement {

	public static void main(String[] args) {
		LinkedList<String> col_list = new LinkedList<String>();
		col_list.add("Green");
		col_list.add("Blue");
		col_list.add("Orange");
		col_list.add("Black");
		col_list.add("White");
		col_list.add("Pink");
		System.out.println("Given linked  list: " + col_list);
		System.out.println("Removed Element : " + col_list.pop());
		System.out.println("Linked list After Pop Operation : " + col_list);

	}

}
