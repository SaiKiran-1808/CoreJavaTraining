package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo3 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(8);
		q.add(2);
		q.add(5);
		q.add(9);
		
		q.clear();
		
		//If we use methods of Priority queue like poll() or remove() after clear we get null as output, 
		//however if we use remove() method which is not part of priority queue we get Exception 
		System.out.println(q.poll());  
		System.out.println(q.remove());
		
	}

}
