//WAP to use add operation of ArrayList
package com.assignment;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(90);
		list.add(70);
		list.add(9);
		list.add(50);

		for (Integer l : list) {
			System.out.println(l);
		}
	}

}
