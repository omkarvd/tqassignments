//3.	Write a java program to check whether two strings are anagram or not
package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First String");
		str1 = scanner.nextLine();

		System.out.println("Enter Second String");
		str2 = scanner.nextLine();
		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
}
