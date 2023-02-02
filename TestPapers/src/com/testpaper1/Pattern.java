//Q9. Write a program to print pyramid pattern of numbers
//                           1
//                        2    2
//                   3    3    3
//            4     4    4    4

package com.testpaper1;

public class Pattern {

	public static void main(String[] args) {
		int i, j, k;

		k = 1;
		for (i = 1; i <= 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
			k++;
		}

	}

}
