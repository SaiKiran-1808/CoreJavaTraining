package com.evergent.corejava.Static;


//This is an example of non static methods can access static variable and static methods.
public class StaticDemo4 {

	static String cname = "India";
	String name = "Welcome";
	
	public static void myData() {
		System.out.println("MyData");
	}
	
	public void show() {
		//Here we are calling static methods and accessing static variables from non static methods.
		myData();  
		System.out.println("Show is in non static method "+cname);
	}
	
	public static void main(String[] args) {
		StaticDemo4 s1 = new StaticDemo4();
		s1.show();
		System.out.println(cname);
		
	}
}
