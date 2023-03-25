//WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintEvenOddUsingFor {

	public static void main(String[] args) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		int[] number = new int[10];
		Scanner read = new Scanner(System.in);

		System.out.print("Enter number :");

		for (int i = 0; i < number.length; i++) {
			number[i] = read.nextInt();
			if (number[i] % 2 == 0) {
				even.add(number[i]);
			} else {
				odd.add(number[i]);
			}
		}
		System.out.println("Even number is :");
		for (Integer e : even) {
			System.out.print(e + " ");
		}
		System.out.println("\nOdd number is :");
		for (Integer o : odd) {
			System.out.print(o + " ");
		}

	}

}
