package com.evergent.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;
//TreeSet implements Set interface
//TreeSet stores elements in ascending order.
public class CF5_TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet<>();
		hs.add(100);
		hs.add(45);
		hs.add(10);
		hs.add(80);

		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
