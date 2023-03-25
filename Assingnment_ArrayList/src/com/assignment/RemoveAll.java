//WAP to remove all elements from ArrayList
package com.assignment;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(90);
		list.add(70);
		list.add(9);
		list.add(50);

		list.removeAll(list);////

		System.out.println(list);

	}

}
