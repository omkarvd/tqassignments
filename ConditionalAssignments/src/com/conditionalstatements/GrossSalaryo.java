/*2. Write a Java program to input basic salary of an employee and calculate its 
Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, 
DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%*/

package com.conditionalstatements;

import java.util.Scanner;

public class GrossSalaryo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary");
		int basic = sc.nextInt();
		float da, hra, gross;
		if (basic <= 10000) {
			hra = basic * 0.20f;
			da = basic * 0.80f;
		} else if (basic <= 20000) {
			hra = basic * 0.25f;
			da = basic * 0.90f;
		} else {
			hra = basic * 0.30f;
			da = basic * 0.95f;
		}
		gross = hra + da + basic;
		System.out.println("Gross salary :" + gross);
	}
}
