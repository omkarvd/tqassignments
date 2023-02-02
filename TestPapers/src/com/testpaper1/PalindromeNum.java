//Q7. Write a program to check number is palindrome or not.

package com.testpaper1;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rem;
		int rev = 0;
		int originalnum = num;
		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		if (originalnum == rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		sc.close();
	}
}
