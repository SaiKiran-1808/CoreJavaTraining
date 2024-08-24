package com.evergent.corejava.Static;


//This is an example of basic static variable and methods.
public class StaticDemo1 {

	static String cname = "India";
	
	public static void myData() {
		System.out.println("MyData");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}
}
