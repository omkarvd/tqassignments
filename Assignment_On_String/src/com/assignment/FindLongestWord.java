//5.	WAP to find longest word in the given sentence
package com.assignment;

public class FindLongestWord {
	public static void main(String[] args) {
		String sentence = "hi how are you";
		String[] words = sentence.split(" ");
		String longestWord = "";
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Longest word in the given sentence: " + longestWord);
	}
}
