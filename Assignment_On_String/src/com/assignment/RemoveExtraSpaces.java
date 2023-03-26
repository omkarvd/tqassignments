//21.	Write a Java program to remove all extra blank spaces from a given string
package com.assignment;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "My Name is Omkar";
		System.out.println(s.replaceAll("\\s", ""));

	}

}
