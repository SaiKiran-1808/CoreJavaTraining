package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack<>();
		s.push("Red");
		s.push("Black");
		s.push("White");

		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s);
	}
}
