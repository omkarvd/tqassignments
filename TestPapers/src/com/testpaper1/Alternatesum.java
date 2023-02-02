//Q8. Write a program to print sum of alternate n numbers.
//If (n= 10 then 1+3+5+7+9= 25)

package com.testpaper1;

import java.util.Scanner;

public class Alternatesum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i = i + 2) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("Sum of Alteranate n numbers :" + sum);

		sc.close();
	}

}
