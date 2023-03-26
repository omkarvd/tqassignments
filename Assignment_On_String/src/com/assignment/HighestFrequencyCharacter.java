//1.	Write a Java program to find highest frequency character in a string.
package com.assignment;

public class HighestFrequencyCharacter {
	public static void main(String[] args) {
		String str = "Helloo World";
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		int maxFreq = 0;
		char maxChar = '\0';
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
				maxChar = (char) i;
			}
		}
		if (maxChar != '\0') {
			System.out.println("The highest frequency character in the string is '" + maxChar
					+ "', with a frequency of " + maxFreq + ".");
		} else {
			System.out.println("The string is empty.");
		}
	}
}
