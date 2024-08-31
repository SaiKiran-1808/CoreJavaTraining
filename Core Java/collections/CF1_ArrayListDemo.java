package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.List;

//This is ArrayList class implementing List interface.
//It can store different types of data as we are not using generics here.
public class CF1_ArrayListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(100);
		al.add("Hello");
		al.add(10.5);
		al.add(100);
		System.out.println(al);
		
	}
}
