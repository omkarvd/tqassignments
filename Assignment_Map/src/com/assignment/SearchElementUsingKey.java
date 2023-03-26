//4.	WAP to search for an element from HashMap using key
package com.assignment;

import java.util.HashMap;

public class SearchElementUsingKey {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Omkar");
		hm.put(2, "Suyog");
		hm.put(3, "Vivek");

		System.out.println("value for key 1 : " + hm.get(1));
	}

}
