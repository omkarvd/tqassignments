//Write a custom exception for the number is negative...
package com.questions;

import java.util.Scanner;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}

public class NegativeNumber {

	public static void main(String[] args) throws NegativeNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");

		int number = sc.nextInt();
		try {
			if (number < 0) {
				throw new NegativeNumberException("number cannot be negative ");
			}
			System.out.println("Positive number");
		} catch (NegativeNumberException e) {
			System.out.println(e);
		}

		System.out.println("Final code");
	}

}
