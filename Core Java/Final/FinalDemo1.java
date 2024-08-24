package com.evergent.corejava.Final;



//This is example of Final variable which cannot be changed
public class FinalDemo1 {
	
	static final String name = "Raju";
	
	
	public void display() {
//		name = "Mani";
		System.out.println("Display method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalDemo1().display();
		
	}

}
