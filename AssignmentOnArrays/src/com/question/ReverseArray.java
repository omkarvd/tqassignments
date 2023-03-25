//WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//output must be 78, 37, 29, 45, 90, 3
package com.question;

public class ReverseArray {
	public static void findReverse(int arr[]) {
		System.out.println("Reverse order of array is : ");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int myarr[] = { 3, 90, 45, 29, 37, 78 };
		findReverse(myarr);

	}
}