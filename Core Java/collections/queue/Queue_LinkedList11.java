package com.evergent.corejava.collections.queue;

import java.util.Deque;
import java.util.LinkedList;


//By default the size of Deque is 16 
public class Queue_LinkedList11 {
	public static void main(String[] args) {
		Deque<String> q = new LinkedList<>();
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
