//WAP to convert collection into array

package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertCollectionToArray {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(30);
		num.add(10);

		Integer[] k = new Integer[num.size()];
		num.toArray(k);
		for (int s : num) { // 1st way
			System.out.println(s);
		}
		System.out.println(Arrays.toString(k));// 2nd way

	}

}
