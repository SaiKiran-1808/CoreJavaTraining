package com.evergent.corejava.Static;


//This is an example of static block
public class StaticDemo5 {

	static String cname = "India";
	String name = "Welcome";

	static {
		System.out.println("Static block");
	}
	
	public static void myData() {
		System.out.println("MyData");
	}
	
	public void show() {	
		myData();  
		System.out.println("Show is in non static method "+cname);
	}
	
	public static void main(String[] args) {
		StaticDemo5 s1 = new StaticDemo5();
		s1.show();
		System.out.println(cname);
		
	}
}
