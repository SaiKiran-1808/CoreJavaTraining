package com.evergent.corejava.ExceptionHandling;

//throws is used to declare multiple exceptions
public class ExceptionDemo18 {

	String name = "null";
	int k = 2;

	public void myData() throws NullPointerException, ArithmeticException {

		System.out.println("One");
		System.out.println(name.length());
		int t = 10 / k;
		System.out.println("End");

	}

	public static void main(String[] args) {
		ExceptionDemo18 e1 = new ExceptionDemo18();
		try {
			e1.myData();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
