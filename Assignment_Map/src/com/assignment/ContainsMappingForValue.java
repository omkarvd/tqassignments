//WAP to test if a HashMap contains a mapping for the specified value
package com.assignment;

import java.util.HashMap;

public class ContainsMappingForValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Omkar");
		hm.put(2, "Suyog");
		hm.put(3, "Vivek");

		System.out.println(hm.containsKey(1));
	}

}
