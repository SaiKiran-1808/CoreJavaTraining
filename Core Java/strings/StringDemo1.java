package com.evergent.corejava.strings;

//Equals and == with creation of string using new keyword
public class StringDemo1 {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if(str1 == str2)
			System.out.println("True");
		else
			System.out.println("False");
			
		if(str1.equals(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
