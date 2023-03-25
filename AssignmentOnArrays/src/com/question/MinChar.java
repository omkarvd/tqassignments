package com.question;

public class MinChar {

	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };
		char min = arr[0];
		for (char i : arr) {
			if (min > i) {
				min = i;
			}
		}
		System.out.println(min);
	}

}
