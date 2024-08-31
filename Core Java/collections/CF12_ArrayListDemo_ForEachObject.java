package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Here we used advance for each loop to print elements.
//In advanced for each loop we can print the data of any single type.
public class CF12_ArrayListDemo_ForEachObject {

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
		
		for(Object o : al) {
			System.out.println(o);
		}
	}
}
