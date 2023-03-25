/*WAP to add elements to arraylist without using generics (no <>) and print content of it where 
Integer is used. In second arraylist String is used*/
package com.assignment;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList a2 = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);

		a2.add("Omkar");
		a2.add("Suyog");
		a2.add("Vivek");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
	}

}
