//Q10. Write a program to print factorial of a number.
package com.testpaper1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int i;
		long fact = 1;
		for (i = 1; i <= n; i++) {
			fact *= i;

		}

		System.out.println("Factorial of " + n + " is:" + fact);
		sc.close();
	}
}
