//. Write a Java program to input any alphabet and check whether it is vowel or consonant 
package com.switchassignment;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet :");
		char ch = sc.next().charAt(0);
		int flag = 0;
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			flag = 1;
			break;

		}
		if (flag == 0) {
			System.out.println("consonant");
		}

		sc.close();
	}

}
