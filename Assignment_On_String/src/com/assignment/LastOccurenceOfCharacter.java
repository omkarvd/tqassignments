//26.	Write a Java program to find last occurrence of a character in a given string.
package com.assignment;

public class LastOccurenceOfCharacter {
	public static void main(String[] args) {
		String str = "Hello World";
		char ch = 'd';
		int lastIndex = str.lastIndexOf(ch);
		if (lastIndex == -1) {
			System.out.println("The character '" + ch + "' is not found in the string.");
		} else {
			System.out.println("The last occurrence of the character '" + ch + "' is at index " + lastIndex + ".");
		}
	}
}
