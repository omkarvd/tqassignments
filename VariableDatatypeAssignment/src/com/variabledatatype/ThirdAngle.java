//12. Write a Java program to enter two angles of a triangle and find the third angle
package com.variabledatatype;

import java.util.Scanner;

public class ThirdAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side:");
		int side1 = sc.nextInt();
		System.out.println("Enter second side");
		int side2 = sc.nextInt();
		int side3 = 180 - (side1 + side2);
		System.out.println("third side is:" + side3);
	}

}
