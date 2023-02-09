//1. Write a Java program to check whether a number is negative, positive or zero

package com.conditionalstatements;

import java.util.Scanner;

public class CheckNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num < 0) {
			System.out.println("Number is negative");
		}

		else {
			System.out.println("Number is zero");
		}
	}
}
