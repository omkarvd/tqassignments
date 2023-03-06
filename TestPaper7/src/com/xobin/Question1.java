package com.xobin;

//input 1 2 3 4 5 6 7 8  9 ----> output 3 6 9
import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			al.add(sc.nextInt());
		}
//
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 3 == 0) {
				System.out.print(al.get(i) + " ");
			}
		}

	}

}
