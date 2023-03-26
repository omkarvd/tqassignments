//	Write a Java program to concatenate two strings
package com.assignment;

public class ConcatenateTwoString {

	public static void Concatinate(String s1, String s2) {
		String s3 = s1 + s2; /// without using method....
		System.out.println(s3);

	}

	public static void main(String[] args) {
		/*
		 * String s1 = "Omkar"; String s2 = " Dhamane"; //Using method.....
		 * System.out.println(s1.concat(s2));
		 */
		String s1 = "Omkar";
		String s2 = " Dhamane";
		Concatinate(s1, s2);

	}

}
