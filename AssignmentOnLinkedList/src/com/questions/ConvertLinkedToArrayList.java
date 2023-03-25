//. WAP to convert a linked list to array list
package com.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedToArrayList {

	public static void main(String[] args) {
		LinkedList<String> linked_list = new LinkedList<String>();
		linked_list.add("Red");
		linked_list.add("Green");
		linked_list.add("Black");
		linked_list.add("White");
		linked_list.add("Pink");
		System.out.println("Original linked list: " + linked_list);

		List<String> list = new ArrayList<String>(linked_list);

		for (String str : list) {
			System.out.println(str);
		}
	}

}
