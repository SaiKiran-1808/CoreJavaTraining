package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		//Autoboxing
		Integer i1 = new Integer(a);
		System.out.println("Integer object : "+i1);
		
		
		//Auto Unboxing
		int a1 = i1.intValue();
		System.out.println("int data type: "+a1);
		
	}

}
