package com.evergent.corejava.collections;

import java.util.Enumeration;
import java.util.Vector;

public class CF7_EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		v.add("Hello");
		v.add(100);
		v.add(10.5);
		
		Enumeration e = v.elements(); 
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
