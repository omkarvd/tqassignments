//Write a program to check the number is prime or not.
package com.papers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean flag = true;
		if (num == 0 || num == 1)
			System.out.println("Not prime");
		else
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println("Not prime");
					flag = false;
					break;
				}
			}

		if (flag) {
			System.out.println("Prime");
		}
	}

}
