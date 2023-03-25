//WAP of swap two elements in an ArrayList
package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Omkar");// 0
		list.add("Virat");// 1
		list.add("Rohit");// 2
		list.add("Yuvraj");// 3

		Collections.swap(list, 3, 0);
		System.out.println(list);

	}

}
