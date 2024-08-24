package com.evergent.corejava.Static;


//This is an example of static methods can access static variable and static methods.
public class StaticDemo2 {

	static String cname = "India";
	String name = "Welcome";
	
	public static void myData() {
		System.out.println("MyData");
	}
	
	public void show() {
		System.out.println("Show is in non static method");
	}
	
	public static void main(String[] args) {
		//Here as we are in static method we can also call methods and variables without class name. 
		System.out.println(cname);
		myData();
	}
}
