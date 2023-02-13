//Write a program to display the number divisible by 3 from 1 to n numbers.
package com.papers;

import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
