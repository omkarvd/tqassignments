//.Write a program that displays the day of the week corresponding to the number entered. i.e., 1 - "Monday", 2- "Tuesday" and so on
package com.switchassignment;

import java.util.Scanner;

public class NumberToDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("error ,day doesn't exists");
		}

	}

}
