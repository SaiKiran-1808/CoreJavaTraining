package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;


//By default the size of Deque is 16 
public class Queue_ArrayDeque8 {
	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<>();
		q.add("Banana");
		q.addFirst("Pineapple");
		q.add("Watermelon");
		q.addLast("Papaya");
			
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.peekLast());
		System.out.println(q.peekFirst());
	}
}
