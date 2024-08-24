package com.evergent.corejava.Final;

//This is example of Final method which cannot be overridden

class MyClass2 {
	final public void myProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends MyClass2 {
	
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
		new FinalDemo2().display();
		
	}

}
