//9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equa
package com.question;

import java.util.Arrays;

public class ArrayEquality {
	public static void main(String[] args) {
		int[] arr1 = { 12, 22, 32, 42, 52, 62 };
		int[] arr2 = { 52, 22, 62, 12, 42, 22 };

		boolean areEqual = Arrays.equals(arr1, arr2);
		// print the result
		if (areEqual) {
			System.out.println("The arrays are equal.");
		} else {
			System.out.println("The arrays are not equal.");
		}
	}
}
