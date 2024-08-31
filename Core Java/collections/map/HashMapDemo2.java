package com.evergent.corejava.collections.map;

import java.util.Hashtable;


public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(100, "Ramesh");
		ht.put(200, "Bhanu");
		ht.put(300, "Nick");
		
		System.out.println(ht);
	}
}
