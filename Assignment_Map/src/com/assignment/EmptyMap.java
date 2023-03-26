//7.	WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map
package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class EmptyMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		for (String key : map.keySet()) {
			map.remove(key);
		}

		System.out.println("Map after emptying: " + map);
	}
}
