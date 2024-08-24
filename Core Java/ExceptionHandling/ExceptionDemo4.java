package com.evergent.corejava.ExceptionHandling;

//We should follow exception hierarchy
public class ExceptionDemo4 {
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
		}
	}
	public static void main(String[] args) {

		ExceptionDemo4 e1 = new ExceptionDemo4();
		e1.myData();
	}

}
