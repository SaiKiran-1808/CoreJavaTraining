package com.evergent.corejava.ExceptionHandling;

//We can use try inside try, Nested Try. 
public class ExceptionDemo3 {

	String name = "null";
	int k = 0;

	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());

			try {
				int t = 10 / k;
			} catch (Exception e) {
				System.out.println("I can handle" + e);
			} finally {
				System.out.println("Inside try block");
			}
			System.out.println("End");
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("I can handle" + e);
		} finally {
			System.out.println("Outside try block");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo3 e1 = new ExceptionDemo3();
		e1.myData();
	}

}
