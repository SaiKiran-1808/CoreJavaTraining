package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
//ArrayList using iterator
public class CF3_ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add("Hello");
		al.add(10.5);
		al.add(100);
		System.out.println(al);

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
