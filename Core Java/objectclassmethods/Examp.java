package com.evergent.corejava.objectclassmethods;


class Examp1{
	public Examp1() {
		System.out.println("Super clsas constructor");
	}
	public Examp1(int a) {
		System.out.println("Super clsassss constructor");
	}
}

public class Examp extends Examp1{
	
	public Examp() {
		super(1);
		System.out.println("Sub class constructor");
	}
	public Examp(int a) {
		System.out.println("Sub class paramaterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Examp e = new Examp();
		Examp e1 = new Examp(1);
		
		

	}

}
