package com.evergent.corejava.collections.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s = new Stack<>();
		s.push("Red");
		s.push("Black");
		s.push("White");

		System.out.println(s);

		System.out.print("Enumeration : ");
		System.out.println();
		Enumeration e = s.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator : ");
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("For each : ");
		for(String k : s) {
			System.out.println(k);
		}
	}
}
