//1. Write a Java program print total number of days in a month
package com.conditionalstatements;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number between 1 to 12");
		int month = sc.nextInt();

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 Days in month");
		} else {
			System.out.println("31 days in month");
		}

	}
}
