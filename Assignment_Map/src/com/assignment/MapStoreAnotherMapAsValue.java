//12.	WAP to create a Map which stores another Map as a value
//13.	WAP to iterate the elements in the Map stored in the above Map
package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class MapStoreAnotherMapAsValue {
	public static void main(String[] args) {

		Map<String, Map<String, Integer>> map = new HashMap<>();

		Map<String, Integer> anotherMap = new HashMap<>();
		anotherMap.put("A", 1);
		anotherMap.put("B", 2);
		anotherMap.put("C", 3);

		map.put("key1", anotherMap);

		Map<String, Integer> retrievedMap = map.get("key1");
		for (Map.Entry<String, Integer> entry : retrievedMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
