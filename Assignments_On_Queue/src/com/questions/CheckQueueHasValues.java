//5.	WAP to check if a queue has values
package com.questions;

import java.util.PriorityQueue;
import java.util.Queue;

public class CheckQueueHasValues {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		queue.offer(10);
		queue.add(20);

		queue.add(90);

		if (queue.isEmpty()) {
			System.out.println("Queue has not values");
		} else {
			System.out.println("Queue has  values");
		}
	}
}
