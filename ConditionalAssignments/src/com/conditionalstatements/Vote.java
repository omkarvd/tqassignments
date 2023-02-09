package com.conditionalstatements;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("eligible to vote");
			if (age >= 65) {
				System.out.println("senior citizen");
			}
		} else {
			System.out.println("not eligible");
		}
	}
}
