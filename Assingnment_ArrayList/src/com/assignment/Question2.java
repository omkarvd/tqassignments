//WAP add elements to arraylist without using generics, 0th location keep Integer, 1st location String 
//now print each element and display contents
package com.assignment;

import java.util.ArrayList;

public class Question2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Omkar");
		list.get(0);
		int i = (int) list.get(0);
		System.out.println(i);
		String s1 = (String) list.get(1);
		System.out.println(s1);

	}
}
