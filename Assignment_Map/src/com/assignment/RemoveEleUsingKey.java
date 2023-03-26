//6.	WAP to remove an element from HashMap using key
package com.assignment;

import java.util.HashMap;

public class RemoveEleUsingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Omkar");
		hm.put(2, "Suyog");
		hm.put(3, "Vivek");

		System.out.println("Before removal :" + hm);

		hm.remove(3);
		System.out.println("After removal : " + hm);

	}

}
