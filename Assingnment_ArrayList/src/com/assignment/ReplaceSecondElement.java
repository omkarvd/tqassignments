// WAP to replace the second element of an ArrayList with the specified element

package com.assignment;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Omkar");// 0
		list.add("Virat");// 1
		list.add("Rohit");// 2
		list.add("Yuvraj");// 3

		list.set(1, "Hardik");
		System.out.println(list);

	}

}
