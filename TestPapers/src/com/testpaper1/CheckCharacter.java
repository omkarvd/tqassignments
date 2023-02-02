//Q11. Write a program to check the character is consonant, vowel, digit or special character
package com.testpaper1;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character :");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') 
		{
			System.out.println("Vowel");
		} 
		else if (((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'))) 
		{
			System.out.println("Consonant");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special character");
		}
	}

}
