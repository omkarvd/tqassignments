//10.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
package com.assignment;

public class SplitString {

	public static void main(String[] args) {
		String str = "HELLO$WORLD";
		String[] tokens = str.split("\\$");
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
	}

}
