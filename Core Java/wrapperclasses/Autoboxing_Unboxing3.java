package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		Integer i= new Integer(a) ;
		int t1 = i.intValue();
		
		System.out.println("int value : "+t1);
		System.out.println("Integer object : "+i);
		
		
		char c1 = 'a';
		Character myc = c1;
		char ch = myc.charValue();
		
		System.out.println("character value : "+ch);
		System.out.println("Character object : "+myc);
		
		
		
	}

}
