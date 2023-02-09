//4. Write a Java program to input any alphabet and check whether it is vowel or consonant

package com.conditionalstatements;

import java.util.Scanner;

public class CheckVowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any alphabet");
		char alphabet = sc.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'i' || alphabet == 'o' || alphabet == 'e' || alphabet == 'u'
				|| alphabet == 'A' || alphabet == 'I' || alphabet == 'O' || alphabet == 'E' || alphabet == 'U') {

			System.out.println("Alphabet is Vowel ");
		} else {
			System.out.println("Alphabet is Consonant");
		}
	}
}
