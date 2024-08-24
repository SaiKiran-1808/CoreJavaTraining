package com.evergent.corejava.collections;

import java.util.LinkedList;

public class CF8_LinkedListDemo {
	public static void main(String[] args) {
		LinkedList fruits = new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		
		System.out.println(fruits);
		
		fruits.addFirst("Mango");
		System.out.println("After adding fruits at first : "+fruits);
		fruits.addLast("Orange");
		System.out.println("After adding fruits at last : "+fruits);
		System.out.println("Fruit contains ? :"+fruits.contains("Banana"));
		System.out.println(fruits.get(2));
		fruits.removeFirst();
		System.out.println("After removing fruits at first position : "+fruits);
		fruits.removeLast();
		System.out.println("After removing fruits at last position : "+fruits);
		fruits.remove("Banana");
		System.out.println("After removing banana : "+fruits);
		System.out.println("Size : "+fruits.size());
		System.out.println("After clearing : ");
		fruits.clear();
		
	}
}
