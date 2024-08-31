package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;


//By default the size of Queue is 10

public class Queue_Demo1 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(8);
		q.offer(2);
		q.add(5);
		q.add(9);
		
		
		System.out.println(q);
		
	}
}
