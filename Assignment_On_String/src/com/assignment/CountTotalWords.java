//14.	Write a Java program to count total number of words in a string
package com.assignment;

public class CountTotalWords {

	public static int countWords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		String s = "my name is omkar !";
		int ct = countWords(s);
		System.out.println(ct);
	}

}
