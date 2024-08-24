package com.evergent.corejava.ExceptionHandling;

//ArrayIndexOutOfBoundsException

public class ExceptionDemo13 {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println("Accessing element at index 10 : "+a1[10]);
		} catch (Exception e) {
			System.out.println("Caught an ArrayIndexOutOfBoundsException : "+e);
			System.out.println("Error : "+e.getMessage());
		}
		System.out.println("Program continues after handling");
	}
}
