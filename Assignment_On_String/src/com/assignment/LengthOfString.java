//	Write a Java program to find length of a string
package com.assignment;

public class LengthOfString {
	public static void main(String[] args) {
		String s = "Omkar";
		System.out.println(s.length()); // Using length method...
		int i = 0;
		for (char c : (s.toCharArray())) { // Without using method...
			i++;
		}
		System.out.println("Length of String is : " + i);
	}
}
