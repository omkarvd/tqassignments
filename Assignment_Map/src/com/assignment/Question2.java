//2.	WAP add elements to HashMap without using generics, 0th location use String as key and Integer as value, on 1st location use String as key String and Integer as value
package com.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Rohit", 1);
		hm.put("Virat", 2);
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> en : entrySet) {
			System.out.println(en.getKey() + " " + en.getValue());
		}

	}

}
