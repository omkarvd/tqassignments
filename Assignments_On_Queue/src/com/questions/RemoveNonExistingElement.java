//4.WAP to attempt to remove non-existing elements from a queue
package com.questions;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveNonExistingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);
		queue.offer(2);
		queue.offer(3);

		queue.remove(4);

		System.out.println(queue);
	}

}
