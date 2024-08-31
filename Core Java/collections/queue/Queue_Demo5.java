package com.evergent.corejava.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//We can also retrieve elements in reverse order.
public class Queue_Demo5 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		q.add(8);
		q.add(2);
		q.add(5);
		q.add(9);

		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}
