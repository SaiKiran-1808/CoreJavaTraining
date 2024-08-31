package com.evergent.corejava.collections.queue;

import java.util.Deque;
import java.util.LinkedList;


//By default the size of Deque is 16 
public class Queue_LinkedList10 {
	public static void main(String[] args) {
		Deque<String> q = new LinkedList<>();
		q.add("Ravi");
		q.add("Bhanu");
		q.add("Shankar");
		q.add("Chandu");
		
		
		System.out.println(q);
		System.out.println(q.poll());

	}

}
