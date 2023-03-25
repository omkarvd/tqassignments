//WAP to know how many elements in ArrayList

package com.assignment;

import java.util.ArrayList;

public class HowManyElements {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("c");
		list1.add(".net");
		int size = list1.size();
		System.out.println("Total elements are :" + size);
	}

}
