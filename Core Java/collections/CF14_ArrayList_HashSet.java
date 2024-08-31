package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//ArrayList stores elements in order and HashSet stores elements in random order so contains method prints false as output even content is same.

public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<>();
		li.add("CoreJAVA");
		li.add("J2EE");
		li.add("J2SE");
		li.add("MyJAVA");
		System.out.println(li);

		
		Set<String> s1 = new HashSet<>();
		s1.addAll(li);
		System.out.println(s1);
		
		Set<String> s2 = new HashSet<>();
		s2.add("CoreJAVA");
		s2.add("J2EE");
		s2.add("J2SE");
		s2.add("MyJAVA");
		s2.add("CoreJAVA");
		s2.add("Hello");
		System.out.println(s1.equals(s2));
				
		if(s1.equals(s2)) {
			System.out.println("Same");
		}
		else 
			System.out.println("Not Same");
		
		System.out.println(s1.containsAll(s2));
	}
}
