package com.assignment;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Saffron");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Black");

		// 2 ways

		// 1st
		colors.removeAll(colors);
		System.out.println(colors);
		// 2nd
//		colors.clear();
//		System.out.println(colors);

	}

}
