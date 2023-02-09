//4. Write a Java program to enter length and breadth of a rectangle and find its area
package com.variabledatatype;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth = sc.nextInt();

		int area = length * breadth;
		System.out.println("Area of rectangle is :" + area);
	}
}
