//Write a custom exception for invalid voting age
package com.questions;

import java.util.Scanner;

class InvalidVotingAgeException extends Exception {
	public InvalidVotingAgeException(String msg) {
		super(msg);
	}
}

public class Vote {

	public static void main(String[] args) throws InvalidVotingAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new InvalidVotingAgeException("Invalid age");

			}
		} catch (InvalidVotingAgeException e) {
			System.out.println(e);
		}
	}

}
