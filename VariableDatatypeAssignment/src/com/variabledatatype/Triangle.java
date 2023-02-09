//13. Write a Java program to enter base and height of a triangle and find its area
package com.variabledatatype;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base");
		float base = sc.nextFloat();

		System.out.println("Enter height");
		float height = sc.nextFloat();

		float area = (base * height) / 2;
		System.out.println("Area of Triangle :" + area);

	}
}
