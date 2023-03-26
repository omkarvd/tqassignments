//4.	Use 2 different method calls to add elements to a queue.
package com.questions;

import java.util.LinkedList;
import java.util.Queue;

public class TwoMethodsCallsToAddEle {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		// Method call 1: add()
		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("Queue elements after add(): " + queue);

		// Method call 2: offer()
		queue.offer(40);
		queue.offer(50);

		System.out.println("Queue elements after offer(): " + queue);
	}
}
