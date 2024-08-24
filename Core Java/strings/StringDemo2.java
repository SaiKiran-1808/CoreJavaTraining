package com.evergent.corejava.strings;

//Equals and == with creation of string using string literal
public class StringDemo2 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
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
