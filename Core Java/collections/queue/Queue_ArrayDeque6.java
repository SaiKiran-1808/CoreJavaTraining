package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;


//By default the size of Deque is 16 
public class Queue_ArrayDeque6 {
	public static void main(String[] args) {
		ArrayDeque<String> q = new ArrayDeque<>();
		q.add("Ravi");
		q.add("Bhanu");
		q.add("Shankar");
		q.add("Chandu");
		
		
		System.out.println(q);
		System.out.println(q.peek());

	}

}
