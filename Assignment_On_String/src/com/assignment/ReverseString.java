//24.	Write a Java program to find reverse of a string
package com.assignment;

public class ReverseString {

	public static void main(String[] args) {
		String s = "omkar";
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--)
			System.out.print(ch[i]);

	}

}
