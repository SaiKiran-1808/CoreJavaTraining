package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(100);
		l1.add(10);
		l1.add(40);
		l1.add(66);
		l1.add(89);
		
		Iterator<Integer> i = l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
