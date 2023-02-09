//2. Write a Java program to check whether a number is divisible by 5 and 11 or not 
package com.conditionalstatements;

import java.util.Scanner;

public class DivisibleByNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num % 5 == 0) {
			System.out.println("Divisible by 5");
			if (num % 11 == 0) {
				System.out.println("Divisible by 11");
			}
		} else {
			System.out.println("Not divisible by 5 and 11");
		}
	}
}
