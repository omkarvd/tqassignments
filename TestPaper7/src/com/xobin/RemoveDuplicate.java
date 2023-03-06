//to remove duplicate numbers from arraylist
//you can take second arralist to store elements
//use iterator to print second arraylist..
//i/p--> 1 2 3 1 2 3 4 5 4 5 ,,,o/p--> 1 2 3 4 5
package com.xobin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			al.add(sc.nextInt());
		}
//
		ArrayList<Integer> duplicates = new ArrayList<>();
		for (Integer i : al) {
			if (!duplicates.contains(i)) {
				duplicates.add(i);
			}
		}

		Iterator<Integer> iterator = duplicates.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

}
