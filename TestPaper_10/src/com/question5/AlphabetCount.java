package com.question5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabetCount {
	public static void main(String[] args) {
		// Input list of strings
		List<String> stringList = Arrays.asList("A+2", "B+12", "D+4", "DD+5");

		// Create a map to store alphabet counts
		Map<Character, Integer> alphabetMap = new HashMap<>();

		// Iterate over each string in the list
		for (String str : stringList) {
			// Split the string into alphabet and count
			String[] parts = str.split("\\+");
			char alphabet = parts[0].charAt(0);
			int count = Integer.parseInt(parts[1]);

			// Add the count to the existing value for the alphabet
			if (alphabetMap.containsKey(alphabet)) {
				count += alphabetMap.get(alphabet);
			}

			// Put the updated count for the alphabet in the map
			alphabetMap.put(alphabet, count);
		}

		// Output the map
		System.out.println("Output: " + alphabetMap);
	}
}