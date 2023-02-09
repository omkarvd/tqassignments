//15. Write a Java program to enter marks of five subjects and calculate total, average and percentage
package com.variabledatatype;

import java.util.Scanner;

public class Subjects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of five subject");
		float sub1 = sc.nextFloat();
		float sub2 = sc.nextFloat();
		float sub3 = sc.nextFloat();
		float sub4 = sc.nextFloat();
		float sub5 = sc.nextFloat();

		float total = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total marks :" + total);

		float average = total / 5;
		System.out.println("Average is :" + average);

		float percentage = (total / 500) * 100;
		System.out.println("Percentage is :" + percentage);
	}
}
