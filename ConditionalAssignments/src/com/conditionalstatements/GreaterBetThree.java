//3. Write a Java program to find maximum between three numbers

package com.conditionalstatements;

public class GreaterBetThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 4;
		int n2 = 3;
		int n3 = 1;

		int greater = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println(greater);
	}

}
