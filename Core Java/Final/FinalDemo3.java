package com.evergent.corejava.Final;

//This is example of Final class which cannot be extended/inherited

final class MyClass3 {
	final public void myProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo3 {
	
	static final String name = "Raju";
	
	public void myProducts1() {
		System.out.println("Hello products");
	}
	
	public void display() {
//		name = "Mani";
		System.out.println("Display method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalDemo3().display();
	}
}
