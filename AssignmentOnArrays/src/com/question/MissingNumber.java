//. Write a Java program to find a missing number in an array. Means e.g. array has 1 
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] 
//So missing no is 5
package com.question;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		int expectedEle = arr.length + 1;
		int total = expectedEle * (expectedEle + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("missing element is :" + (total - sum));
	}

}
