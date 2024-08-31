package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;


//By default the size of Deque is 16 
public class Queue_ArrayDeque7 {
	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<>();
		q.add("Banana");
		q.addFirst("Pineapple");
		q.add("Watermelon");
		q.addLast("Papaya");
		q.offerFirst("Kiwi");
		q.offer("Apple");
		q.offerLast("Mango");

		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.clear();
		System.out.println(q);

	}

}
