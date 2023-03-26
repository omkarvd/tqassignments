//3.	Use 2 different method calls to remove elements from a queue.
package com.questions;

import java.util.LinkedList;
import java.util.Queue;

public class TwoMethodsCallsToRemoveEle {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println(queue);

		// Method call 1: remove()
		queue.remove(20);
		queue.remove(10);

		System.out.println("Queue elements after remove(): " + queue);

		// Method call 1: poll()
		queue.poll();

		System.out.println("Queue elements after poll(): " + queue);
	}
}
