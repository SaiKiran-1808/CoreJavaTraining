package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet<>();
		hs.add(100);
		hs.add("Hello");
		hs.add(10.5);
		hs.add(100);
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
