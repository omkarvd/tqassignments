//WAP to arrange the elements of an given array of integers where all negative 
//integers appear before all the positive integers.
package com.question;

import java.util.Arrays;

public class NegativeBeforePositive {

	public static void main(String[] args) {

		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		Arrays.sort(arr);

		System.out.print(Arrays.toString(arr));

	}
}
