// WAP to check if an array of integers contains two specified elements 65 and 77. 
package com.question;

public class CheckSpecifiedElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 65, 4, 77, 6, 7 };
		boolean contains65 = false;
		boolean contains77 = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 65) {
				contains65 = true;
			}
			if (arr[i] == 77) {
				contains77 = true;
			}
		}

		if (contains65 && contains77) {
			System.out.println("The array contains both 65 and 77.");
		} else {
			System.out.println("The array does not contain both 65 and 77.");
		}
	}
}
