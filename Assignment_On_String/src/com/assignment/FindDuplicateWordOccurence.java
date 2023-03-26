//1.	Write a java program to find the duplicate words and their number of occurrences in a string
package com.assignment;

public class FindDuplicateWordOccurence {
	public static void main(String[] args) {
		String str = "hi hi hello how how are you you ";
		String[] words = str.split(" ");
		int count;
		System.out.println("Duplicate words in the given string: ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;

					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.println(words[i] + " : " + count);
			}
		}
	}
}
