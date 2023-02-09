//Write a Java program to enter marks of five subjects and calculate total, average and percentage
package com.operators;

import java.util.Scanner;

public class StudentPercentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name :");
		String firstName = sc.next();
		System.out.println("Enter the last name :");
		String lastName = sc.next();

		System.out.println("Enter marks of five subject");
		float sub1 = sc.nextFloat();
		float sub2 = sc.nextFloat();
		float sub3 = sc.nextFloat();
		float sub4 = sc.nextFloat();
		float sub5 = sc.nextFloat();

		float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total marks :" + totalMarks);

		float percentage = (totalMarks / 500) * 100;
		System.out.println(firstName + " " + lastName + " " + "has scored :" + percentage + "%");
	}
}
