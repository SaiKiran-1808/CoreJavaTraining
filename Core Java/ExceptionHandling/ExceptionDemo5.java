package com.evergent.corejava.ExceptionHandling;

//Finally block will be executed even the exception occurs or not
public class ExceptionDemo5 {
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
		} catch (Exception e) {
			System.out.println("I can handle" + e);
		} finally {
			System.out.println("Finally block is used to close DB connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 e1 = new ExceptionDemo5();
		e1.myData();
	}

}
