//Write a custom exception for student is the marks entered for any subject is less than 0 or greater than 100.
package com.questions;

import java.util.Scanner;

class InvalidMarksException extends Exception {
	public InvalidMarksException(String message) {
		super(message);
	}
}

public class Student {

	public static void main(String argv[]) throws InvalidMarksException

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		try {
			if (marks < 0 || marks > 100)

			{

				throw new InvalidMarksException("Input marks are less than 0  or greater than 100 ");

			}
		} catch (InvalidMarksException e) {
			System.out.println(e);
		}

	}
}
