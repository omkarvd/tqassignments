// WAP to arrange the elements of an given array of integers where all Even integers 
//appear before all the Odd integers.
package com.question;

import java.util.Arrays;

public class EvenBeforeOdd {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 24, 26, 89, 65, 44, 77, 88 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] % 2 != 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
