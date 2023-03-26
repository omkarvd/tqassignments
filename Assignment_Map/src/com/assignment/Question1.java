//1.	WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.
package com.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Rohit");
		hm.put(2, "Virat");
		hm.put(3, "Rahul");
		System.out.println("----key=int --value=String----");
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> en : entrySet) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
		HashMap hm2 = new HashMap();
		hm2.put("Rohit", 1);
		hm2.put("Virat", 2);
		hm2.put("Rahul", 3);

		System.out.println("---key=String ,value=Integer---");
		Set<Entry<String, Integer>> entrySet2 = hm2.entrySet();
		for (Entry<String, Integer> en2 : entrySet2) {
			System.out.println(en2.getKey() + " " + en2.getValue());
		}
	}

}
