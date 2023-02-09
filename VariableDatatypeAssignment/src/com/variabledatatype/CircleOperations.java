//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.
package com.variabledatatype;

import java.util.Scanner;

public class CircleOperations {
	public static void main(String[] args) {
		float pi = 3.141f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius = sc.nextFloat();

		float diameter = 2 * radius;
		System.out.println("Diameter of circle is:" + diameter);

		float circumference = 2 * pi * radius;
		System.out.println("Circumference is :" + circumference);

		float area = pi * radius * radius;
		System.out.println("Area of Circle :" + area);
	}
}
