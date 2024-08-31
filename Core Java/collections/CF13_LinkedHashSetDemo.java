package com.evergent.corejava.collections;

import java.util.LinkedHashSet;

//LinkedList implements list interface.
//Insertion and deletion is easy in linked list.

public class CF13_LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("Apple");
		ls.add("Orange");
		ls.add("Banana");
		ls.add("Grapes");
		ls.add("Mango");

		System.out.println("Prinitng LinkedHashSet");
		System.out.println(ls);
		for (String s : ls) {
			System.out.println(s);
		}

		ls.remove("Mango");

		System.out.print("Contains mango : ");
		System.out.println(ls.contains("Mango"));

		System.out.println("Size : " + ls.size());

		System.out.print("After clearing : ");
		ls.clear();
		System.out.println(ls);
	}
}
