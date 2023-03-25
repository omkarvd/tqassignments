//. WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

package com.paper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintEvenUsingIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 50; i++)
			numbers.add(i);

		Iterator<Integer> itr = numbers.iterator();
		System.out.println("Even numbers are :");
		while (itr.hasNext()) {
			int n = itr.next();
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}

		}

	}
}