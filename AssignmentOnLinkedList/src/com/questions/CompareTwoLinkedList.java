package com.questions;

import java.util.LinkedList;

public class CompareTwoLinkedList {

	public static void main(String[] args) {
		LinkedList<String> b1_list = new LinkedList<String>();
		b1_list.add("Java");
		b1_list.add("C");
		b1_list.add("Cpp");
		b1_list.add("Python");
		b1_list.add("Php");
		System.out.println(b1_list);
		LinkedList<String> b2_list = new LinkedList<String>();
		b2_list.add("Cpp");
		b2_list.add("Html");
		b2_list.add("Php");
		b2_list.add("MySql");
		System.out.println(b2_list);
		LinkedList<String> b3_list = new LinkedList<String>();
		for (String e : b1_list) {
			b3_list.add(b2_list.contains(e) ? "Yes" : "No");
		}
		System.out.println(b3_list);

	}

}
