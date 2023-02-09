//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter

package com.variabledatatype;

import java.util.Scanner;

public class RectanglePerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth = sc.nextInt();

		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle is :" + perimeter);
	}
}
