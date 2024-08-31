package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s = new Stack<>();
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		s.push("Date");

		System.out.println(s);
		System.out.print("After peek : ");
		System.out.println(s.peek());
		System.out.print("After pop : ");
		System.out.println(s.pop());
		System.out.println("Is Empty : " + s.isEmpty());
		int position = s.search("Banana");
		if (position != -1)
			System.out.println("Position : " + position);
		else
			System.out.println("Banana is not in stack");
		System.out.print("After cleaning : ");
		s.clear();
		System.out.println(s);
	}
}
