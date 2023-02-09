//10)find which is greatest  number in between 2 numbers  using switch
package com.switchassignment;

import java.util.Scanner;

public class GreatestBetTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();

		int greater = (num1 > num2) ? num1 : num2;
		switch (greater) {
		case 1:
			System.out.println(" number 1 is greater");
			break;
		case 2:
			System.out.println(" number 2 is greater");
			break;
		}
	}

}
