package com.evergent.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(100, "Ramesh");
		mp.put(200, "Bhanu");
		mp.put(300, "Nick");
		mp.put(null, "abc");
		mp.put(700, null);
		
		
		
		System.out.println(mp);

	}

}
