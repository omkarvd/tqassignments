//WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 
package com.question;

import java.util.Arrays;

public class SwapArray {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 0 };

		int temp;
		temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;

		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;

		for (int num : arr) {

		}
		System.out.print(Arrays.toString(arr));
	}
}
