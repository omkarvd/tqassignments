//16. Write a Java program to enter P, T, R and calculate Simple Interest
package com.variabledatatype;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the P");
		float P = sc.nextFloat();
		System.out.println("Enter the T");
		float T = sc.nextFloat();
		System.out.println("Enter the R");
		float R = sc.nextFloat();

		float SI = (P * T * R) / 100;
		System.out.println("Simple Interest is :" + SI);

	}
}
