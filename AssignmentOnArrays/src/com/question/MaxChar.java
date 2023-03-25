package com.question;

public class MaxChar {
	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'e', 'x', 'R', 'Z', 'p' };
		char max = arr[0];
		for (char i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
