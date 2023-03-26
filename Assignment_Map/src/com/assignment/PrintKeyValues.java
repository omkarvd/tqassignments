package com.assignment;

//5.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintKeyValues {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "BMW");
		hm.put(3, "AUDI");
		hm.put(2, "Jaguar");
		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
