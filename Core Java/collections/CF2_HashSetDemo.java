package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;


//HashSet is a class implements Set interface.
//HashSet stores elements in random order.
public class CF2_HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet<>();
		hs.add(100);
		hs.add("Hello");
		hs.add(10.5);
		hs.add(100);
		System.out.println(hs);
	}
}
