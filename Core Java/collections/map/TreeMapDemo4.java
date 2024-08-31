package com.evergent.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> mp = new TreeMap<>();
		mp.put(102, "UK");
		mp.put(101, "Washington DC");
		mp.put(103, "Berlin");
		mp.put(104, "India");
		System.out.println(mp);
		for(Map.Entry<Integer, String> entry : mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
