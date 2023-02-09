//. Write a Java program to create Simple Calculator using switch case Menu Driven 
package com.switchassignment;

import java.util.Scanner;

public class SimpleCalculatroSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the operator");
		char op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println("addition is :" + (num1 + num2));
			break;
		case '-':
			System.out.println("subtraction is:" + (num1 - num2));
			break;
		case '*':
			System.out.println("Multiplication is:" + (num1 * num2));
			break;
		case '/':
			System.out.println("Division is :" + (num1 / num2));
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
