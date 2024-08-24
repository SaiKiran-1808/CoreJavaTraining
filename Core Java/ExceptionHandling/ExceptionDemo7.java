package com.evergent.corejava.ExceptionHandling;

//Throws is used to declare an exception
//The calling method should handle the exception and using throws the exception is transferred from method to method 
public class ExceptionDemo7 {
	String name = "null";
	int k = 0;
	public void myData() throws NullPointerException {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10 / k;
			System.out.println("End");
		} catch (NullPointerException e) {
			System.out.println("I can handle" + e);
		} finally {
			System.out.println("Finally block is used to close DB connections");
		}
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7 e1 = new ExceptionDemo7();			
			e1.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
