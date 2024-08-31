package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		HashMap<String,String> mp = new HashMap<>();
		mp.put("India", "Delhi");
		mp.put("USA", "Washington DC");
		mp.put("Germany", "Berlin");
		mp.put("India", "Delhi");
		
		System.out.println(mp);
		
		for(String s : mp.keySet()) {
			System.out.println(s);
		}
	}
}
