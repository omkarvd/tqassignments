//WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] by using temporary array. 
package com.question;

import java.util.Arrays;

public class ReverseUsingTemp {
	public static void findReverse(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int myarr[] = { 3, 90, 45, 29, 37, 78 };
		findReverse(myarr);
	}

}
