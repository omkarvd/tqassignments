//1.	WAP to copy all of the mappings from the specified HashMap to another map
package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class CopyFromHashmapToMap {
	public static void main(String[] args) {

		Map<String, Integer> sourceMap = new HashMap<>();
		sourceMap.put("Arnav", 1);
		sourceMap.put("Bharat", 2);
		sourceMap.put("Chetan", 3);

		Map<String, Integer> copy = new HashMap<>();
		copy.put("Omkar", 4);

		copy.putAll(sourceMap);

		System.out.println("Destination Map: " + copy);
	}
}
