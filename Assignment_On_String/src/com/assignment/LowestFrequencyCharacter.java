//28.	Write a Java program to find lowest frequency character in a string
package com.assignment;

public class LowestFrequencyCharacter {
	public static void main(String[] args) {
		String str = "Hello World";
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		int minFreq = Integer.MAX_VALUE;
		char minChar = '\0';
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0 && freq[i] < minFreq) {
				minFreq = freq[i];
				minChar = (char) i;
			}
		}
		if (minChar != '\0') {
			System.out.println("The lowest frequency character in the string is '" + minChar + "', with a frequency of "
					+ minFreq + ".");
		} else {
			System.out.println("The string is empty.");
		}
	}
}
