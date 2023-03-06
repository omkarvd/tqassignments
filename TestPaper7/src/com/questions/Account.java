//// Write a custom exception in Account class. If the balance is less than 0 we cannot withdraw the amount

package com.questions;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class Account {
	public static void main(String[] args) throws InsufficientBalanceException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balanace:");

		int balance = sc.nextInt();
		try {
			if (balance < 0) {
				throw new InsufficientBalanceException(
						"The balance must be greater than 0 so We cannot withdraw amount");
			}

		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}

		System.out.println("Final code");
	}
}
