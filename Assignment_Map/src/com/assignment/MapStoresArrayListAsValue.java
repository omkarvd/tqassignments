//10.	WAP to create a map which stores an arraylist as a value
//11.	WAP to iterate the elements in the arraylist stored in the above Map.
package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapStoresArrayListAsValue {
	public static void main(String[] args) {

		Map<String, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		map.put("Laptop", list1);
		System.out.println(map);
		ArrayList<Integer> list2 = map.get("Laptop");
		for (int i : list2) {
			System.out.println(i);
		}

	}
}
