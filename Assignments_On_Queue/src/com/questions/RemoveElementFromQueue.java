//2.	WAP to remove an element from a queue
package com.questions;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveElementFromQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		q.add(50);
		q.add(40);
		q.add(70);
		System.out.println(q);
		System.out.println("After removing element :" + q.remove(50));
		System.out.println(q);
	}

}
