//42.	Write a Java program to find total number of alphabets, digits or special character in a string.
package com.assignment;

public class FindTotalAlphaDigitSpecialChar {
	public static void main(String[] args) {
		String str = "Hello World 9678 $$!";
		int alphabets = 0, digits = 0, specialChars = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				alphabets++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specialChars++;
			}
		}
		System.out.println("Total number of alphabets in the string: " + alphabets);
		System.out.println("Total number of digits in the string: " + digits);
		System.out.println("Total number of special characters in the string: " + specialChars);
	}
}
