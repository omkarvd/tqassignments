//2.	WAP to test a HashMap is empty or not
package com.assignment;

import java.util.HashMap;

public class EmptyOrNot {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "virat");
		h.put(2, "MSD");
		System.out.println(h.isEmpty());

	}

}
