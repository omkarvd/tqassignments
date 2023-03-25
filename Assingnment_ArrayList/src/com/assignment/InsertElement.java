//WAP to insert an element into the ArrayList at the first position
package com.assignment;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		list.add(1, "Saffron");//
		System.out.println(list);

	}

}
