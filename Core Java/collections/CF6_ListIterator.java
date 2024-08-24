package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class CF6_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList<>();
		al.add("ramu");
		al.add("ravi");
		al.add("mani");
		al.add("jake");
		System.out.println(al);

		ListIterator lt = al.listIterator();
		lt.add("welcome");

		while (lt.hasNext()) {
			String s = (String) lt.next();
			if (s.equals("mani")) {
				lt.remove();
			}
		}
		
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
