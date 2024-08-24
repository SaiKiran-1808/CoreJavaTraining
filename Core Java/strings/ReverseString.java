package com.evergent.corejava.strings;


//Reverse of a string using StringBuilder in-built method
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println(sb);

	}

}
