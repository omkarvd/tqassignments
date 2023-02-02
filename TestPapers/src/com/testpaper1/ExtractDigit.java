//Q6. Write a program to extract digits from a number.

package com.testpaper1;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		while (num != 0) {
			int rem = num % 10;
			System.out.println(rem);

			num /= 10;
		}
		sc.close();
	}

}
