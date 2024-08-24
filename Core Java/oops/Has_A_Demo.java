package com.evergent.corejava.oops;

public class Has_A_Demo {

	public void show() {
		System.out.println("Local Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_A_Demo obj = new Has_A_Demo();
		obj.show();
		
		Person p1 = new Person();
		p1.display();
		
	}

}
