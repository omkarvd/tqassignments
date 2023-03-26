package com.questions;

//2.	WAP to create a Queue with some colors (String) &amp; using generics
import java.util.LinkedList;
import java.util.Queue;

public class ColorsQueue {

	public static void main(String[] args) {
		Queue<String> colors = new LinkedList<>();
		colors.add("Saffron");
		colors.add("Black");
		colors.add("White");
		colors.add("Purple");
		System.out.println(colors);
	}

}
