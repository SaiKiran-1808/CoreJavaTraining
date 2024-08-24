package com.evergent.corejava.ExceptionHandling;

//All exception are executed while abnormal conditions only
//It wont execute any exceptions in normal flow
//Once any exceptions are occurring in java code then remaining lines of code is unreachable   

public class ExceptionDemo2 {
	String name = "null";
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch (NullPointerException e) {
			System.out.println("I can handle"+e);
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo2 e1 = new ExceptionDemo2();
		e1.myData();
	}

}
