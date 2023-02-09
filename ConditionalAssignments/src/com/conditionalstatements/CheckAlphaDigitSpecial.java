//2. Write a Java program to input any character and check whether it is alphabet, digit or special character

package com.conditionalstatements;

import java.util.Scanner;

public class CheckAlphaDigitSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("character is alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("character is Digit");
		} else {
			System.out.println("Character is Special");
		}

	}
}
