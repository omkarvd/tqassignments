//3.	WAP to add elements to a HashMap using generics with Integer as Key and String as value. And 4 key-value Map.Entry
package com.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rohit");
		hm.put(2, "Virat");
		hm.put(3, "Rahul");
		hm.put(4, "jadeja");
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> en : entrySet) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

}
