
//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
package com.question;

import java.util.Arrays;

public class SecondMaxValue {

	public static void sortArray(int arr[]) {
		int temp;
		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])// ascending <: descending
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println("Second Highest:" + arr[size - 2]);

	}

	public static void main(String[] args) {

		int[] myarr = { 20, 0, 31, 45, 100, 1, 105, 90 };

		sortArray(myarr);

		System.out.println("After Sorting:");

		System.out.println(Arrays.toString(myarr));

	}

}
