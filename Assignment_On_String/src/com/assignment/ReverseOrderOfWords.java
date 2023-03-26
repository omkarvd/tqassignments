//25.	Write a Java program to reverse order of words in a given string
package com.assignment;

public class ReverseOrderOfWords {
	public static void main(String[] args) {
		String str = "Hello World";
		String[] words = str.split("\\s");
		String reversedString = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString += words[i] + " ";
		}
		System.out.println("Original string: " + str);
		System.out.println("String with words in reverse order: " + reversedString.trim());
	}
}
