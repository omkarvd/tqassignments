package com.questions;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysToItrateArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Omkar");
		list.add("Suyog");
		list.add("Vivek");
		list.add("Tejas");
		list.add("Yashank");
		list.add("Gaurav");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------------");
		for (String names : list) {
			System.out.println(names);

		}

		System.out.println("-------------------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------");

	}
}
