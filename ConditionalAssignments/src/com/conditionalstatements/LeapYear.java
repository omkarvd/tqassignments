//1. Write a Java program to check whether a year is leap year or not 
package com.conditionalstatements;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();

		if (year % 400 == 0) {

			System.out.println("Year is leap year :");

		} else if (year % 4 == 0 && year % 100 != 0) {

			System.out.println("leap :");
		} else {
			System.out.println("Not leap");
		}

	}

}
