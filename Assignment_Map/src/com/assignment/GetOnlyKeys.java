//6.	WAP to get only the Keys from a HashMap
package com.assignment;

import java.util.HashMap;
import java.util.Set;

public class GetOnlyKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rohit");
		hm.put(2, "Virat");
		hm.put(3, "Rahul");
		hm.put(4, "jadeja");
		Set<Integer> keySet = hm.keySet();

		for (Integer key : keySet) {
			System.out.println(key);
		}

	}

}
