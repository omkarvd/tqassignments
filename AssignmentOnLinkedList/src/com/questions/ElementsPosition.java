// WAP to display the elements and their positions in a linked list.
package com.questions;

import java.util.LinkedList;

public class ElementsPosition {

	public static void main(String[] args) {
		LinkedList<String> fru_list = new LinkedList<String>();
		fru_list.add("Papaya");
		fru_list.add("Mulberry");
		fru_list.add("Apple");
		fru_list.add("Banana");
		fru_list.add("Cherry");
		fru_list.add("Watermelon");

		System.out.println("Original linked list:" + fru_list);
		for (int i = 0; i < fru_list.size(); i++) {
			System.out.println("Element at index " + i + " : " + fru_list.get(i));
		}

	}

}
