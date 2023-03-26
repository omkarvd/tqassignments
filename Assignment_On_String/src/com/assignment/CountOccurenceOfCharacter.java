//Write a Java program to count occurrences of a character in given string
package com.assignment;

public class CountOccurenceOfCharacter {

	public static void CountCharacter(String s) {
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if ((ch[i] == ' ') || (ch[i] == '\0'))
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + " = " + count);

		}
	}

	public static void main(String[] args) {
		String s1 = "Hi Omkar ,How Are you ?";

		CountCharacter(s1);
	}

}
