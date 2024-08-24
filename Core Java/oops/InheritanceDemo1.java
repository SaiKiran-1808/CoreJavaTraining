package com.evergent.corejava.oops;

public class InheritanceDemo1 extends Calculation{
	
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		
		InheritanceDemo1 i1 = new InheritanceDemo1();
		i1.show();
		
		i1.addition();

	}

}
