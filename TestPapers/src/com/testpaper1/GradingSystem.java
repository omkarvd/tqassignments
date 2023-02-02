/*Q5. Write a program to create grading system for students. Input: Marks of 5 subjects out of 100
          Grade A: >85% ,B: 70% ,C: 55%, D: 40% , Else Fail*/
package com.testpaper1;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks of 5 subjects out of 100");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();

		double total = s1 + s2 + s3 + s4 + s5;
		double per = (total / 500.00) * 100;

		if (per >= 85) {
			System.out.println("A Grade");
		} else if (per >= 70 && per < 85) {
			System.out.println("B Grade");
		} else if (per >= 55 && per < 70) {
			System.out.println("C Grade");
		} else if (per >= 40 && per < 55) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail");
		}

		sc.close();
	}

}
