//There are 2 different arraylist , both contain student objects. But there are students present in both lists. Create a set which contains student objects from both lists. Ensure that no student objects are repeated
package com.paper;

import java.util.ArrayList;

public class Student1 {
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("Ram");
		a1.add("Suyog");
		a1.add("Ratndeep");
		a1.add("Vivek");

		System.out.println("List a1: " + a1);

		ArrayList<String> a2 = new ArrayList<>();

		a2.add("Suyog");
		a2.add("Adinath");
		a2.add("Ratndeep");
		a2.add("Gaurav");
		a2.add("Omkar");
		a2.add("Vivek");

		System.out.println("List a2: " + a2);

		System.out.println("________________________________________");
		// displayunique(a1, a2);

		// displaycommon(a1, a2);

		ArrayList<String> a3 = new ArrayList<String>(a1);

		a3.retainAll(a2);

		System.out.println("Common elements: " + a3);
	}

}
