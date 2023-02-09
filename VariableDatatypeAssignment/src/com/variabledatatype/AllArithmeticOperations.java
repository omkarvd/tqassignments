//2. Write a Java program to enter two numbers and perform all arithmetic operations.
package com.variabledatatype;

import java.util.Scanner;

public class AllArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		int addition = num1 + num2;
		System.out.println("Addition is :" + addition);

		int subtraction = num1 - num2;
		System.out.println("Subtraction is :" + subtraction);

		int multiplication = num1 * num2;
		System.out.println("Multiplication is :" + multiplication);

		int division = num1 / num2;
		System.out.println("Division is :" + division);
	}
}
