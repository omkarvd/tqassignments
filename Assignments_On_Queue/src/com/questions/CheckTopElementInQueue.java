//1.	WAP to check the top element in a queue
package com.questions;

import java.util.PriorityQueue;
import java.util.Queue;

public class CheckTopElementInQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		q.add(50);
		q.add(40);
		q.add(70);
		System.out.println(q);
		System.out.println("Top element in queue is :" + q.peek());
	}

}
