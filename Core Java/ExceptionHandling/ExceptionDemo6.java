package com.evergent.corejava.ExceptionHandling;

//We should use catch or finally after try block
public class ExceptionDemo6 {
	String name = "null";
	int k = 2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10 / k;
			System.out.println("End");
		} finally {
			System.out.println("Finally block is used to close DB connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 e1 = new ExceptionDemo6();
		e1.myData();
	}

}
