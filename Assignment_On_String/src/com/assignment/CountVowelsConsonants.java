//23.	Write a Java program to count total number of vowels and consonants in a string
package com.assignment;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String s = "Omkar Vasant Dhamane";
		s = s.toLowerCase();
		int vcount = 0;
		int ccount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vcount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ccount++;
			}

		}
		System.out.println("Total vowels :" + vcount);
		System.out.println("Total consonants :" + ccount);
	}

}
