package com.evergent.corejava.ExceptionHandling;

//If there are 2 exceptions in class developer should handle 1st exception then 2nd exception will be handled next.
public class ExceptionDemo20 {

	String name = "null";
	int k = 2;

	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10 / k;
			System.out.println("End");
		} catch (NullPointerException e) {
			System.out.println("I can handle" + e);
		} catch (ArithmeticException e) {
			System.out.println("I can handle" + e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo20 e1 = new ExceptionDemo20();
		e1.myData();
	}

}
