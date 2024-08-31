package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassDemo4_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		Integer i1 = new Integer(a);
		
		ArrayList mylist = new ArrayList();
		mylist.add(i1);
		
		System.out.println(mylist);
		
		Integer i2 = new Integer(200);
		mylist.add(i2);
		System.out.println(mylist);
	
		mylist.add(new Integer(25));
		System.out.println(mylist);
		
		System.out.println(mylist.get(1));
		}
}
