// WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 
//9, 78, 66, 39, 0] so output is 25, 49, 9.
package com.question;

public class DisplaySquareNumber {

	public static void main(String[] args) {
		int[] arr = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		// iterate over each element in the array
		for (int num : arr) {
			// check if the number is a square number
			if (num >= 1 && Math.sqrt(num) % 1 == 0) {
				// print the square number
				System.out.print(num + " ");
			}
		}
	}
}
