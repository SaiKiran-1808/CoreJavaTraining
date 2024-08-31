package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo4 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(8);
		q.add(2);
		q.add(5);
		q.add(9);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
