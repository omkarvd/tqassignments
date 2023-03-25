//WAP to remove element from ArrayList
package com.assignment;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(90);
		list.add(70);
		list.add(9);
		list.add(50);

		list.remove(0);
		list.remove(2);
		System.out.println(list);

	}

}
