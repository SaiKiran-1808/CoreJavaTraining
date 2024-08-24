package com.evergent.corejava.Static;


//This is an example of static methods can't access non static variable and non static methods.
public class StaticDemo3 {

	static String cname = "India";
	String name = "Welcome";
	
	public static void myData() {
//		System.out.println(name);
		System.out.println("MyData");
//		show();
	}
	
	public void show() {
		System.out.println("Show is in non static method");
	}
	
	public static void main(String[] args) {
		 
		System.out.println(cname);
		myData();
	}
}
