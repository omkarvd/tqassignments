//WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
package com.question;

import java.util.Arrays;

public class SecondMinValue {
	public static void checkSecondMin(int arr[]) {
		int size = arr.length;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[1]);
	}

	public static void main(String[] args) {
		int[] myarr = { -20, 0, -25, 15, 19, 37, 23 };
		checkSecondMin(myarr);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(myarr));
	}
}
