package com.evergent.corejava.oops;

//Loosely Encapsulation
public class Calculation {

	int a = 10;
	int b = 20;
	int c;
	public void addition() {
		c = a + b;
		System.out.println(c);
	}
	
	public void subtraction() {
		c = b - a;
		System.out.println(c);
	}
	
	public void multiplication() {
		c = a * b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal1 = new Calculation(); 
		cal1.addition();
		cal1.subtraction();
		cal1.multiplication();
		
	}

}
