package com.xobin;

import java.util.ArrayList;

public class TwoDigitNumbers {
	public static boolean isTwoDigit(int num) {
		return num >= 10 && num <= 99;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(17);
		numbers.add(2);
		numbers.add(43);
		numbers.add(94);
		numbers.add(5);

		int count = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (isTwoDigit(numbers.get(i))) {
				count++;
			}
		}
		System.out.println("Number of two digit numbers: " + count);
	}

}
