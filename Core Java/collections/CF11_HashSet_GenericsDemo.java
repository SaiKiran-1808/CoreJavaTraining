package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

//Generics are used to define the type of objects, that need to be used in class and at compile time type checking happens.

public class CF11_HashSet_GenericsDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(100);
		hs.add(20);
		hs.add(60);

		Iterator<Integer> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		for (Integer k : hs) {
			System.out.println(k);
		}
	}
}
