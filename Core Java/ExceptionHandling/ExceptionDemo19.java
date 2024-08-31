package com.evergent.corejava.ExceptionHandling;

//We can use multiple exceptions inside catch and separating with OR
public class ExceptionDemo19 {

	String name = "null";
	int k = 2;

	public void myData() throws NullPointerException, ArithmeticException {

		System.out.println("One");
		System.out.println(name.length());
		int t = 10 / k;
		System.out.println("End");
	}

	public static void main(String[] args) {
		ExceptionDemo19 e1 = new ExceptionDemo19();
		try {
			e1.myData();

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e);
		}
	}
}
