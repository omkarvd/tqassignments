//7. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit
package com.variabledatatype;

import java.util.Scanner;

public class CelciusToFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		float celcius = sc.nextFloat();

		float fahrenheit = (celcius * 9 / 5) + 32;
		System.out.println("Celcius to fahrenheit :" + fahrenheit);
	}
}
