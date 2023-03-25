//WAP to print all elements of ArrayList using iterator
package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayUsingIterator {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Omkar");
		names.add("Omi");
		names.add("oma");

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
