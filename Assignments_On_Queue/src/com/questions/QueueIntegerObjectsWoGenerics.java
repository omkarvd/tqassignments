package com.questions;

//1.	WAP to create a Queue with Integer objects without using generics
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntegerObjectsWoGenerics {
	public static void main(String[] args) {
		Queue integer = new PriorityQueue();

		integer.add(1);
		integer.add(6);
		integer.add(3);

		System.out.println(integer);

	}
}