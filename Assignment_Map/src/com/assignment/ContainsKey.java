//WAP to test if a HashMap contains a mapping for the specified key
package com.assignment;

import java.util.HashMap;

public class ContainsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "virat");
		h.put(2, "MSD");

		System.out.println(h.containsKey("iii"));
	}

}
