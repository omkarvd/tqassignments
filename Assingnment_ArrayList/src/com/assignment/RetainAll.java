package com.assignment;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("c");
		list1.add(".net");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("java");
		list2.add("c");
		list2.add("dbms");

		list1.retainAll(list2);/////
		System.out.println("Common elements :" + list1);

	}

}
