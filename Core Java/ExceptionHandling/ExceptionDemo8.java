package com.evergent.corejava.ExceptionHandling;

//throws is used to transfer call from method to method or layer to layer.
public class ExceptionDemo8 {
	String name = "null";
	public void myData() throws NullPointerException {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
	}
	
	public void myInfo() {
		System.out.println("My Info Methods");
	}
	
	public static void main(String[] args) {
		try {
			ExceptionDemo8 e1 = new ExceptionDemo8();			
			e1.myInfo();
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
	}
}
