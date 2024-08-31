package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack<>();
		s.push("Red");
		s.push("Black");
		s.push("White");

		System.out.println(s);
		s.clear();
		boolean b = s.isEmpty();
		System.out.println(b);
		
		System.out.println(s);
	}
}
