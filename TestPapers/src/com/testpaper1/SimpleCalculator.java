//Q12.  Write a program to create simple calculator.

package com.testpaper1;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the operator :");
		char op = sc.next().charAt(0);

		if (op == '+') {
			System.out.println("Addition is :" + (num1 + num2));
		} else if (op == '-') {
			System.out.println("Subtraction is :" + (num1 - num2));
		} else if (op == '*') {
			System.out.println("Multiplication is :" + (num1 * num2));
		} else if (op == '/') {
			System.out.println("Division is :" + (num1 / num2));
		} else {
			System.out.println("invalid operation");
		}
	}
}

